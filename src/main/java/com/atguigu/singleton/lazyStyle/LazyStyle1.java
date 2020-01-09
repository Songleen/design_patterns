package com.atguigu.singleton.lazyStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/17:05
 * <p>
 * 懒汉式（线程不安全）
 * 多线程中，如果两个或以上的线程进入了if判断，则会创建多个实例
 * 实际开发中：不要使用
 */
public class LazyStyle1 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

    }
}

class Singleton {
    //1、申明变量，但不赋值
    private static Singleton singleton;

    //2、私有构造
    private Singleton() {

    }

    //3、提供公共获取实例的方法，并在其中创建对象
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
