package com.atguigu.decorator.component;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/18:11
 */
public class Huawei implements Phone {

    @Override
    public void call() {
        System.out.println("用华为手机打电话");
    }
}
