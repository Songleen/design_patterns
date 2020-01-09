package com.atguigu.strategy.stratege_pattern.duck;

import com.atguigu.strategy.stratege_pattern.stratege.FlyBehavior;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/17:55
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫……");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }

    //改进
    public void fly(){
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
