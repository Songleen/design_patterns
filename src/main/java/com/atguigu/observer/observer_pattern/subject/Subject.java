package com.atguigu.observer.observer_pattern.subject;

import com.atguigu.observer.observer_pattern.observer.Observer;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/16:19
 */
public interface Subject {
    void registerObserver(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
