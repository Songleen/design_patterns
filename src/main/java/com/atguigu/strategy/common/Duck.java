package com.atguigu.strategy.common;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:22
 */
public abstract class Duck {
    public Duck() {
    }

    public abstract void display();

    public void quack(){
        System.out.println("鸭子呱呱叫");
    }
    public void fly(){
        System.out.println("鸭子能会飞一会");
    }
    public void swim(){
        System.out.println("鸭子会游泳……");
    }
}
