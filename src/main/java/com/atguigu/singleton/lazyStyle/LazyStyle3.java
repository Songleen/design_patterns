package com.atguigu.singleton.lazyStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/17:18
 * <p>
 * 懒汉式（同步代码块）
 * 线程不安全的，不推荐使用
 */
public class LazyStyle3 {
    public static void main(String[] args) {
//        Singleton3 singleton1 = Singleton3.getInstance();
//        Singleton3 singleton2 = Singleton3.getInstance();
//        System.out.println(singleton1 == singleton2);
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton3 instance = Singleton3.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}

class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                singleton3 = new Singleton3();
            }
        }
        return singleton3;
    }
}