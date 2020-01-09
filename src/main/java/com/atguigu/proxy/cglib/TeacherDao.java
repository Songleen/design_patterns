package com.atguigu.proxy.cglib;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/10:54
 */
public class TeacherDao {
    public String teach(){
        System.out.println("老师授课中，我是cglib代理，不需要实现接口");
        return "hello";
    }
}
