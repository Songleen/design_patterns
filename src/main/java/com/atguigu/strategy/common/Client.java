package com.atguigu.strategy.common;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:30
 */
public class Client {
    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
    }
}
