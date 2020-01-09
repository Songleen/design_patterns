package com.atguigu.factory.factoryMethod.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/18:25
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为北京胡椒披萨准备材料");
    }
}
