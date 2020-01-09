package com.atguigu.factory.simpleFactory.orderPizza;

import com.atguigu.factory.simpleFactory.pizza.Pizza;
import com.atguigu.factory.simpleFactory.pizzaFactory.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:44
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            String pizzaType = getPizzaType();
            Pizza pizza = this.simpleFactory.createPizza(pizzaType);
            if (pizza != null) { //订购成功
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }


    //写一个方法，获取客户端输入的披萨种类
    private String getPizzaType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
