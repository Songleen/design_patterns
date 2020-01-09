package com.atguigu.observer.common.currentCondition;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/15:40
 */
public class SecondTv {
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，由WeatherData来调用，使用推送模式
    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("我是第二频道：today's temperature:"+temperature);
        System.out.println("我是第二频道：today's pressure:"+pressure);
        System.out.println("我是第二频道：today's humidity:"+humidity);
    }
}
