package com.atguigu.prototype.cloneSheep2.deepClone;

import java.io.Serializable;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/31/21:28
 *
 * 注意：如果此处用了@data和构造参数注解，深拷贝会失败，原因尚不清楚；
 */

public class Dog implements Cloneable, Serializable {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override   //浅拷贝
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
