package com.atguigu.singleton.hungryStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/16:29
 * <p>
 * 饿汉式(静态常量)
 * 优点：写法简单，在类加载的时候就完成实例化，避免了多线程问题；
 * 缺点：没有达到lazy loading的效果，可能会造成内存浪费；
 */
public class HungryStyle1 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton {

    //1、私有构造
    private Singleton() {

    }

    //2、创建对象实例
    private static final Singleton singleton = new Singleton();

    //3、对外提供一个共有的获取静态方法
    public static Singleton getInstance() {
        return singleton;
    }
}