package com.atguigu.factory.absFactory.order;

import com.atguigu.factory.absFactory.factory.AbsFactory;
import com.atguigu.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.OffsetDateTime;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/10:46
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";  //用户输入
        this.absFactory = absFactory;
        do{
            orderType = getOrderType();
            //factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = absFactory.createPizza(orderType);
            if (pizza != null){ //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while(true);
    }


    //写一个可以获取用户输入的披萨种类
    private String getOrderType(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入披萨种类：");
        String s = null;
        try {
            s = reader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
