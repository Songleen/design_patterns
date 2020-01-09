package com.atguigu.factory.absFactory;

import com.atguigu.factory.absFactory.factory.BJFactory;
import com.atguigu.factory.absFactory.order.OrderPizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/11:02
 */
public class Client {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
