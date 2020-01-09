package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/06/20:59
 */
public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    //打印包含的系
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
