package com.atguigu.factory.factoryMethod.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:27
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为伦敦胡椒披萨准备材料");
    }
}
