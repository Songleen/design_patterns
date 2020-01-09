package com.atguigu.factory.factoryMethod.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:23
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为北京奶酪披萨准备材料");
    }
}
