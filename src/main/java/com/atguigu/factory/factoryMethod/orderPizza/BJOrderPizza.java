package com.atguigu.factory.factoryMethod.orderPizza;

import com.atguigu.factory.factoryMethod.pizza.BJCheesePizza;
import com.atguigu.factory.factoryMethod.pizza.BJPepperPizza;
import com.atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:54
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("BJCheesePizza")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if (pizzaType.equals("BJPepperPizza")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
