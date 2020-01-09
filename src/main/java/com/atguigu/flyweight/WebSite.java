package com.atguigu.flyweight;

import com.atguigu.flyweight.externalState.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/9:13
 *
 * 抽象的享元角色，同时定义出对象的外部状态和内部状态的接口或实现
 */
public abstract class WebSite {

    //此处的User就是外部状态
    public abstract void use(User user);
}
