package com.atguigu.observer.observer_pattern.observer;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/16:15
 *
 * 观察者接口，有观察者来实现
 */
public interface Observer {
    void update(float temperature,float pressure,float humidity);
}
