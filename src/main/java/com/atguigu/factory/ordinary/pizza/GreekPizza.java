package com.atguigu.factory.ordinary.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/21:10
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
