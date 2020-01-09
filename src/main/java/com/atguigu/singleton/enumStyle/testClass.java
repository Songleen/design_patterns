package com.atguigu.singleton.enumStyle;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/18:18
 *
 * 枚举实现单例
 * 在枚举类中只定义一个属性，即可实现单例
 * 实际开发中也是推荐使用的
 */
public class testClass {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayok();
    }
}

enum Singleton{
    INSTANCE;           //只定义一个属性，实现单例
    public void sayok(){
        System.out.println("hello");
    }
}


