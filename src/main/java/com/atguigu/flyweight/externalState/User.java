package com.atguigu.flyweight.externalState;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/9:18
 *
 * 外部状态：简单理解成可以变化的一个标记，不可共享的的状态；
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
