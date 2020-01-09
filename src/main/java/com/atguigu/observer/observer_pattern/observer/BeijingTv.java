package com.atguigu.observer.observer_pattern.observer;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/16:44
 */
public class BeijingTv implements Observer {

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("这里是北京卫视，今天的天气是："+temperature+"==="+pressure+"==="+humidity);
    }
}
