package com.atguigu.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/9:58
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyObject(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("study")){
                    method.invoke(target, args);
                    System.out.println("没有错，学生应该努力学习");
                }else {
                    //如果不是调用study方法，那么调用原来的方法
                    return method.invoke(target, args);
                }
                return null;
            }
        });
    }
}
