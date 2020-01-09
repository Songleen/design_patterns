package com.atguigu.iterator.colleage;

import com.atguigu.iterator.department.Department;

import java.util.Iterator;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/17:16
 */
public interface Colleage {
    public String getName();

    //增加系的方法
    public void addDepartment(String name,String desc);

    //返回迭代器，遍历
    public Iterator createIterator();
}
