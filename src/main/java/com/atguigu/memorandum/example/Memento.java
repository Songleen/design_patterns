package com.atguigu.memorandum.example;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/18:16
 *
 * 备忘录对象 负责保存好记录，即Originator内部状态
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
