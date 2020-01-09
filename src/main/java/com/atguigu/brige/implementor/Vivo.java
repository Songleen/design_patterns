package com.atguigu.brige.implementor;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:20
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机了");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机了");
    }
}
