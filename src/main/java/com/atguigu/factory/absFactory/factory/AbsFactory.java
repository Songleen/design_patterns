package com.atguigu.factory.absFactory.factory;

import com.atguigu.factory.factoryMethod.pizza.Pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/10:36
 */
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
