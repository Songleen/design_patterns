package com.atguigu.flyweight;

import com.atguigu.flyweight.externalState.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/9:22
 *
 * 内部状态：对象共享出来的信息，存储在享元对象内部不会随环境的改变而改变
 */
public class ConcreteWebSite extends WebSite {

    //共享的部分，内部状态；网站发布的形式(类型)
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"在使用中的作者是："+user.getName());
    }
}
