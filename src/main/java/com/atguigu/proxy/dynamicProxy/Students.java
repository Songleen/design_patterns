package com.atguigu.proxy.dynamicProxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/9:53
 */
public class Students implements IStudent {

    @Override
    public void study() {
        System.out.println("学生应该学习……");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(name+":早上好……");
    }
}
