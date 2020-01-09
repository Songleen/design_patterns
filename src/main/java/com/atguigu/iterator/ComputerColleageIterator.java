package com.atguigu.iterator;

import com.atguigu.iterator.department.Department;

import java.util.Iterator;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/17:22
 */
public class ComputerColleageIterator implements Iterator {

    Department[] departments;   //这里我们需要Department以什么方式存放
    int position = 0;       //遍历的位置

    public ComputerColleageIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //默认空实现
    @Override
    public void remove() {

    }
}
