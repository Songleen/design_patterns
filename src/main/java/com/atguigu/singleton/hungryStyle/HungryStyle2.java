package com.atguigu.singleton.hungryStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/16:29
 * <p>
 * 饿汉式(静态代码块),和静态常量的区别就是将对象的实例化放在了静态代码块中；
 * 优点：写法简单，在类加载的时候就完成实例化，避免了多线程问题；
 * 缺点：没有达到lazy loading的效果，可能会造成内存浪费；
 */
public class HungryStyle2 {

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton2 {

    //1、私有构造
    private Singleton2() {}

    //2、创建对象实例
    private static final Singleton2 singleton2;

    //3、将对象的实例化放在静态代码块中
    static {
        singleton2 = new Singleton2();
    }

    //4、对外提供一个共有的获取静态方法
    public static Singleton2 getInstance() {
        return singleton2;
    }
}