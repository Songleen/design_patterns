package com.atguigu.strategy.common;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:37
 */
public class ToyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫……");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞……");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭也不会游泳……");
    }
}
