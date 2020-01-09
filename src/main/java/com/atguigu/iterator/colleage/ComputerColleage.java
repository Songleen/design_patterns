package com.atguigu.iterator.colleage;

import com.atguigu.iterator.ComputerColleageIterator;
import com.atguigu.iterator.department.Department;

import java.util.Iterator;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/17:20
 */
public class ComputerColleage implements Colleage {

    Department[] departments;
    int numOfDepartment = 0; //保存当前数组的对象个数

    public ComputerColleage() {
        departments = new Department[5];
        addDepartment("土木工程系", "Java专业");
        addDepartment("机电工程系", "PHP专业");
        addDepartment("机械工程系", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name,String desc) {
        Department d = new Department(name, desc);
        departments[numOfDepartment] = d;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerColleageIterator(departments);
    }
}
