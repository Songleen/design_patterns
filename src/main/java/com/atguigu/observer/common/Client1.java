package com.atguigu.observer.common;

import com.atguigu.observer.common.currentCondition.CurrentCondition;
import com.atguigu.observer.common.weatherData.WeatherData;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/15:18
 */
public class Client1 {
    public static void main(String[] args) {
        CurrentCondition c = new CurrentCondition();
        WeatherData data = new WeatherData(c);
        data.setData(5, 5, 5);
        System.out.println("========天气信息更新了==========");
        data.setData(10, 10, 10);
    }
}
