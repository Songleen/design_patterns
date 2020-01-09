package com.atguigu.factory.simpleFactory.pizza;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/28/22:24
 */
public abstract class Pizza {

    private String name; //给每个披萨取一个好听的名字

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void prepare(); //抽象出不同披萨的不同源材料

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
