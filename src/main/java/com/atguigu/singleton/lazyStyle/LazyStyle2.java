package com.atguigu.singleton.lazyStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/17:11
 * 懒汉式（线程安全 同步方法）
 * 解决了线程安全问题，但在多线程中，效率低下
 * 实际开发中，不推荐使用
 */
public class LazyStyle2 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton2 instance = Singleton2.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}

class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
