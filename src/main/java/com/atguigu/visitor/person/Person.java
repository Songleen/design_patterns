package com.atguigu.visitor.person;

import com.atguigu.visitor.action.Operation;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/15:56
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Operation action);
}
