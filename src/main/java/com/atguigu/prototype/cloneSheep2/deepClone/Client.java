package com.atguigu.prototype.cloneSheep2.deepClone;

import org.junit.Test;

import java.io.IOException;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/01/20:02
 *
 * 原型模式；不用重新初始化对象，动态地获得对象运行时的状态
 *          但是需要为每个类配一个克隆方法
 */
public class Client {

    @Test
    public void test1() throws CloneNotSupportedException, IOException {
        DeepDog d = new DeepDog();
        d.setName("Lucy");
        d.setDog(new Dog("Tom", "黑"));

        DeepDog d1 = (DeepDog) d.clone();   //完成深拷贝
        //DeepDog d1 = (DeepDog) d.deepClone();   //通过序列化

        System.out.println(d.getDog().hashCode());
        System.out.println(d1.getDog().hashCode());
    }
}
