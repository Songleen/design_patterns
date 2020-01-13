package com.atguigu.brige.abstraction;

import com.atguigu.brige.implementor.Brand;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:27
 */
public class FolderPhone extends Phone {
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠手机开机了！！！");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠手机打电话！！！");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠手机关机了！！！");
    }
}
