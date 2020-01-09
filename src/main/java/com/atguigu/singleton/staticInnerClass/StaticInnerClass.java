package com.atguigu.singleton.staticInnerClass;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/17:59
 *
 * 静态内部类
 * 1、外部类加载的时候，静态内部类不会马上加载，因此实现了懒加载；
 * 2、当用到内部类调用其中的变量的时候会导致内部类被装载（只会被装载一次），而类在被装载的时候是线程安全的；
 *
 * 实际开发中也是推荐使用的
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        /*Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());*/
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton instance = Singleton.getInstance();
                    System.out.println(instance.hashCode());
                }
            }).start();
        }
    }
}

class Singleton{

    //1、私有构造
    private Singleton(){};

    //2、编写静态内部类,有一个属性，类型为外部类
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //3、提供公共的访问方法
    public static Singleton getInstance(){

        //这个动作会导致静态内部类被装载，而类的装载是线程安全的
        return SingletonInstance.INSTANCE;
    }
}
