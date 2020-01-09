package com.atguigu.factory.ordinary.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/21:09
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
