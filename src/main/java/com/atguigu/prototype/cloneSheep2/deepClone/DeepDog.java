package com.atguigu.prototype.cloneSheep2.deepClone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/01/19:47
 */
public class DeepDog implements Serializable, Cloneable {
    private String name;
    private Dog dog;

    //完成深拷贝-使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();   //先完成对基本数据类型的克隆
        DeepDog deepDog = (DeepDog) deep;   //对引用类型属性进行单独处理(将Object转成它的子类DeepDog)

        deepDog.dog = (Dog) dog.clone();
        return deepDog;
    }

    //深拷贝-通过对象的序列化实现
    public Object deepClone() throws IOException {
        //创建流对象
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepDog deepDog = (DeepDog) ois.readObject();
            return deepDog;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            bos.close();
            bis.close();
            ois.close();
            oos.close();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
