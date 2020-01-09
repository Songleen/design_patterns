package com.atguigu.factory.ordinary.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/21:03
 */
public abstract class Pizza {
    protected String name;  //披萨名字

    public void setName(String name) {
        this.name = name;
    }

    //不相同的步骤进行抽象
    public abstract void prepare();

    //相同的步骤直接实现
    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }
}
