package com.atguigu.observer.observer_pattern;

import com.atguigu.observer.observer_pattern.observer.BeijingTv;
import com.atguigu.observer.observer_pattern.observer.Observer;
import com.atguigu.observer.observer_pattern.observer.TianjinTv;
import com.atguigu.observer.observer_pattern.subject.WeatherInfo;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/16:46
 */
public class Client2 {
    public static void main(String[] args) {
        WeatherInfo info = new WeatherInfo();
        Observer btv = new BeijingTv();
        info.registerObserver(btv);

        TianjinTv ttv = new TianjinTv();
        info.registerObserver(ttv);
        info.setData(10, 10, 10);
    }
}
