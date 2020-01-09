package com.atguigu.prototype.cloneSheep2.shallowClone;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/31/20:49
 *
 * Java中Object类是所有类的根类，Object类提供了一个clone()方法，该方法可以
 * 将一个Java对象复制一份，但是需要实现clone的Java类必须要实现一个接口Cloneable，
 * 该接口表示该类能够复制且具有复制的能力 => 原型模式
 *
 * 原型模式：用原型实例指定创建对象的种类，通过拷贝这些原型，产生新的对象;
 *
 * 5) 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有
 *         的类进行改造时，需要修改其源代码，违背了ocp原则，这点请同学们注意。
 */
@Data
@ToString
public class Sheep implements Cloneable{
    private String name;
    private String color;
    private int age;
    private String address = "蒙古羊";


    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    //重写克隆方法，是从Object中继承下来的,使用默认的clone方法(浅拷贝)
    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
