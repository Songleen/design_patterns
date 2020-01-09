package com.atguigu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/10:56
 *
 * 这里需要实现MethodInterceptor接口
 */
public class ProxyFatory implements MethodInterceptor {

    //维护目标对象
    private Object target;

    public ProxyFatory(Object target) {
        this.target = target;
    }

    //返回一个代理对象：是target对象的代理对象
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer(); //创建一个工具类
        enhancer.setSuperclass(target.getClass());  //设置父类
        enhancer.setCallback(this);     //设置回调函数
        Object o = enhancer.create();   //创建子类对象，即代理对象
        return o;
    }

    //重写intercept方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object value = method.invoke(target, objects);
        System.out.println("没有错，学生应该好好学习");
        return value;
    }
}
