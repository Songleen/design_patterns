package com.atguigu.proxy.staticProxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/9:45
 */
public class Teacher implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师给我们上课……");
    }

    @Override
    public void checkHomework() {
        System.out.println("老师给我们改作业");
    }
}
