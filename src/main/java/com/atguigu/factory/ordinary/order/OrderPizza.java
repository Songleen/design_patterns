package com.atguigu.factory.ordinary.order;

import com.atguigu.factory.ordinary.pizza.CheesePizza;
import com.atguigu.factory.ordinary.pizza.GreekPizza;
import com.atguigu.factory.ordinary.pizza.PepperPizza;
import com.atguigu.factory.ordinary.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/21:12
 *
 * 常规方式中，如果要新增一种披萨(比如PepperPizza)，不仅需要修改扩展抽象类Pizza(合理修改)
 * ,还需要修改本类(Pizza的使用类)，这违反了设计模式中的开闭原则；
 */
public class OrderPizza {

    private Pizza pizza;
    private String pizzaType;

    public OrderPizza() {
        do{
            pizzaType = getPizzaType();

            if (pizzaType.equals("GreekPizza")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (pizzaType.equals("CheesePizza")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if (pizzaType.equals("PepperPizza")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    //写一个方法，可获取客户希望订购Pizza种类
    private String getPizzaType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String pizzaType = reader.readLine();
            return pizzaType;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
