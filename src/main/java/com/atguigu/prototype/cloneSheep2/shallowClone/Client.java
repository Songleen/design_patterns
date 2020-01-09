package com.atguigu.prototype.cloneSheep2.shallowClone;

import org.junit.Test;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/31/21:03
 *
 * 用这种克隆的方式：如果羊需要增加或减少属性，只需要修改实体类就行了。
 * 浅拷贝：
 *      对于基本数据类型的成员变量，浅拷贝会直接进行值传递；
 *      对于引用数据类型的成员变量，浅拷贝会进行引用传递（也就是赋值内存地址给新的对象）；
 */
public class Client {

    //浅拷贝
    @Test
    public void test1(){
        Sheep sheep = new Sheep("Tom", "黑", 12);
        Sheep sheep1 = (Sheep) sheep.clone();   //克隆
        Sheep sheep2 = (Sheep) sheep.clone();   //克隆
        Sheep sheep3 = (Sheep) sheep.clone();   //克隆
        Sheep sheep4 = (Sheep) sheep.clone();   //克隆
        Sheep sheep5 = (Sheep) sheep.clone();   //克隆

        System.out.println(sheep1.hashCode()+"\n"+sheep2.hashCode()+"\n"+sheep3+'\n'+sheep4+'\n'+sheep5);
    }

    /**
     * 深拷贝：
     *      重写clone方法来实现深拷贝；
     *      深拷贝实现方式2：通过对象序列化实现深拷贝(推荐)；
     */
}
