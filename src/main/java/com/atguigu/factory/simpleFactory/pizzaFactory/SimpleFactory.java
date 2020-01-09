package com.atguigu.factory.simpleFactory.pizzaFactory;

import com.atguigu.factory.simpleFactory.pizza.CheesePizza;
import com.atguigu.factory.simpleFactory.pizza.GreekPizza;
import com.atguigu.factory.simpleFactory.pizza.PepperPizza;
import com.atguigu.factory.simpleFactory.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:30
 * <p>
 * 简单工厂模式：这种模式下，如果想要新增一中pizza，只需要在工厂里"进行生产"就行了
 */
public class SimpleFactory {
    private Pizza pizza;

    public Pizza createPizza(String pizzaType) {
        System.out.println("使用简单工厂模式：");

        if (pizzaType.equals("GreekPizza")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (pizzaType.equals("CheesePizza")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (pizzaType.equals("PepperPizza")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


}
