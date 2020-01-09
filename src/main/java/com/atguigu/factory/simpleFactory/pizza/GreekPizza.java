package com.atguigu.factory.simpleFactory.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:29
 */
public class GreekPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
