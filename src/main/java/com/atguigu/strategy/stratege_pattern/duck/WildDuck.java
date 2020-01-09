package com.atguigu.strategy.stratege_pattern.duck;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/19:12
 */
public class WildDuck extends Duck {

    public WildDuck() {
    }

    @Override
    public void display() {
        System.out.println("----野鸭----");
    }
}
