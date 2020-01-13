package com.atguigu.composite;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/06/20:11
 *
 */
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 此处为啥不写成抽象的呢？因为叶子节点不需要add任何东西，如果此处抽象，到时叶子节点也需要重写此方法
     * 什么是默认实现？java8中可以在接口中定义一个default修饰的方法，这样任何一个实现了改接口的类都会自动继承default修饰的方法的实现
     * 类实现了接口,不过却刻意地将一些方法的实现留白。
     */

    //默认实现
    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    //默认实现
    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    //做成抽象的，子类都要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
