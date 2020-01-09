package com.atguigu.brige.implementor;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:22
 */
public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }
}
