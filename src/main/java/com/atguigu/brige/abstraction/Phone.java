package com.atguigu.brige.abstraction;

import com.atguigu.brige.implementor.Brand;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:23
 */
public abstract class Phone {   //像“桥”一般，将实现类聚合过来
    private Brand brand;
    public Phone(Brand brand) {
        this.brand = brand;
    }
    public void open(){
        brand.open();
    }
    public void call(){
        brand.call();
    }
    public void close(){
        brand.close();
    }
}
