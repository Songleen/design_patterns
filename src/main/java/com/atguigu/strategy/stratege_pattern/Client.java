package com.atguigu.strategy.stratege_pattern;

import com.atguigu.strategy.stratege_pattern.duck.PekingDuck;
import com.atguigu.strategy.stratege_pattern.duck.WildDuck;
import com.atguigu.strategy.stratege_pattern.stratege.GoodFlyBehavior;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/18:58
 */
public class Client {
    public static void main(String[] args) {
        PekingDuck pDuck = new PekingDuck();
        pDuck.fly();

        //动态改变对象的行为
        pDuck.setFlyBehavior(new GoodFlyBehavior());
        pDuck.fly();

        WildDuck wDuck = new WildDuck();
        wDuck.setFlyBehavior(new GoodFlyBehavior());
        wDuck.display();
        wDuck.fly();
    }
}
