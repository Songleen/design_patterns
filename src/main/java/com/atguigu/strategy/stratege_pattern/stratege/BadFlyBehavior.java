package com.atguigu.strategy.stratege_pattern.stratege;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:53
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得不咋地");
    }
}
