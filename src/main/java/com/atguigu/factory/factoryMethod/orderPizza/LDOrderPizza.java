package com.atguigu.factory.factoryMethod.orderPizza;

import com.atguigu.factory.factoryMethod.pizza.LDCheesePizza;
import com.atguigu.factory.factoryMethod.pizza.LDPepperPizza;
import com.atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:58
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("LDCheesePizza")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        } else if (pizzaType.equals("LDPepperCheese")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }
}
