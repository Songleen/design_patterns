package com.atguigu.factory.simpleFactory.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/29/17:56
 */
public class PepperPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
