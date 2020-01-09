package com.atguigu.strategy.stratege_pattern.duck;

import com.atguigu.strategy.stratege_pattern.stratege.BadFlyBehavior;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/18:00
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("---北京鸭---");
    }
}
