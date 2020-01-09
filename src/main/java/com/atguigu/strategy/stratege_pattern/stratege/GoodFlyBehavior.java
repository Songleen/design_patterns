package com.atguigu.strategy.stratege_pattern.stratege;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:54
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞得不错");
    }
}
