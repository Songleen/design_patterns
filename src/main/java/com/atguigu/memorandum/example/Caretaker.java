package com.atguigu.memorandum.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/18:26
 * <p>
 * 守护者对象，负责保存多个备忘录对象，使用集合管理，提高效率
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取第index个Originator的备忘录对象(即保存状态)
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
