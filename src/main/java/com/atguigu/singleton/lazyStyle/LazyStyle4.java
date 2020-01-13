package com.atguigu.singleton.lazyStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/17:18
 * <p>
 * 懒汉式（双重检查）
 * 线程安全，支持懒加载，同时也保证了效率，推荐使用
 */
public class LazyStyle4 {
    public static void main(String[] args) {
//        Singleton3 singleton1 = Singleton3.getInstance();
//        Singleton3 singleton2 = Singleton3.getInstance();
//        System.out.println(singleton1 == singleton2);
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}

class Singleton4 {
    //volatile可让修改值立刻更新到主存，内存可见性
    private static volatile Singleton4 singleton4;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null){         //进行第二次检查
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}