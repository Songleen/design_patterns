package com.atguigu.factory.simpleFactory.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:28
 */
public class CheesePizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
