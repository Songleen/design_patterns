package com.atguigu.factory.simpleFactory.pizzaStore;

import com.atguigu.factory.simpleFactory.orderPizza.OrderPizza;
import com.atguigu.factory.simpleFactory.pizzaFactory.SimpleFactory;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:42
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
