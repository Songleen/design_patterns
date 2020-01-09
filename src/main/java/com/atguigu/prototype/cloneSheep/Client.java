package com.atguigu.prototype.cloneSheep;

import org.junit.Test;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/31/20:51
 *
 * 需求：创建属性完全相同的十只羊
 * 传统方式：
 *      优点：好理解、简单
 *      缺点：1、总是需要获取原始对象的属性，如果对象复杂，则效率较低；
 *           2、总需要重新初始化对象，而不是动态获取对象运行时的状态。
 *
 */
public class Client {

    //传统方式
    @Test
    public void test1(){
        Sheep sheep = new Sheep("Tom", "白", 2);

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        System.out.println(sheep1+"\n"+sheep2+"\n"+sheep3+'\n'+sheep4+'\n'+sheep5);
    }
}
