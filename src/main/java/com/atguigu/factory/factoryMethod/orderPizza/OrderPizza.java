package com.atguigu.factory.factoryMethod.orderPizza;

import com.atguigu.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:41
 * <p>
 * 将创建pizza的方法抽象出来，让其子类去实现
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String pizzaType);   //定义一个抽象方法，让各个子类自己实现

    public OrderPizza() {    //构造器
        Pizza pizza = null;
        String pizzaType;
        do {
            pizzaType = getPizzaType();
            pizza = createPizza(pizzaType); //抽象方法，由子类完成
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }


    //写一个接受键盘输入的披萨类型
    public String getPizzaType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizzaType:");
            String pizzaType = reader.readLine();
            return pizzaType;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
