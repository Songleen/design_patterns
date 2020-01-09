package com.atguigu.proxy.dynamicProxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/10:10
 */
public class Test02 {
    public static void main(String[] args) {
        ProxyFactory proxy = new ProxyFactory(new Students());
        IStudent student = (IStudent) proxy.getProxyObject();   //返回一个代理对象
        student.study();
        student.sayHello("小白");
    }
}
