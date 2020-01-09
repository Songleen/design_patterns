package com.atguigu.iterator.output;

import com.atguigu.iterator.colleage.Colleage;
import com.atguigu.iterator.department.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/17:46
 */
public class OutPutImpl {

    List<Colleage> colleages;

    public OutPutImpl(List<Colleage> colleages) {
        this.colleages = colleages;
    }

    //遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege() {
        //从colleges取出所有学院，Java中List已经实现Iterator
        Iterator<Colleage> iterator = colleages.iterator();
        while (iterator.hasNext()) {
            Colleage colleage = iterator.next();
            System.out.println("===" + colleage.getName() + "===");
            printDepartment(colleage.createIterator());     //得到对应的迭代器
        }
    }

    //输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName() + "=====" + d.getDesc());
        }
    }
}
