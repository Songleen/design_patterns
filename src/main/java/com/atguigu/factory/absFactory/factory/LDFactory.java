package com.atguigu.factory.absFactory.factory;

import com.atguigu.factory.factoryMethod.pizza.LDCheesePizza;
import com.atguigu.factory.factoryMethod.pizza.LDPepperPizza;
import com.atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/10:43
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
