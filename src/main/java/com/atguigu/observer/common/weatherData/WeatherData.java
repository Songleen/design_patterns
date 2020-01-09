package com.atguigu.observer.common.weatherData;

import com.atguigu.observer.common.currentCondition.CurrentCondition;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/14:57
 * <p>
 * 包含最新的天气情况信息
 * 含有currentConditions对象
 * 当数据更新时，就主动调用CurrentConditions对象update方法(含display)，这样接入方就看到最新消息
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        currentCondition.update(temperature, pressure, humidity);
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature,float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息推送给接入方currentCondition
        dataChange();
    }
}
