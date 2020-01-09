package com.atguigu.factory.factoryMethod.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:26
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为伦敦奶酪披萨准备材料");
    }
}
