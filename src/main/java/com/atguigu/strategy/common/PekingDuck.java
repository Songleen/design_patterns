package com.atguigu.strategy.common;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:28
 */
public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("----北京鸭----");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭子不能飞");
    }
}
