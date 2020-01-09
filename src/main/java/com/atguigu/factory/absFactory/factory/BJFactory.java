package com.atguigu.factory.absFactory.factory;

import com.atguigu.factory.factoryMethod.pizza.BJCheesePizza;
import com.atguigu.factory.factoryMethod.pizza.BJPepperPizza;
import com.atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/10:38
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
