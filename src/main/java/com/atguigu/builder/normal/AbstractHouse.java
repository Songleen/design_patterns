package com.atguigu.builder.normal;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/13:52
 *
 * 常规方式:将建造房子的公共方法抽取出来，因为任何一种房子的建造都用得上；
 * 优点：程序结构简单，便于理解；
 * 缺点：将房子和创建房子的过程封装在一起，耦合性增强了。
 * 解决方案：将产品和创建产品的过程解耦 ==> 建造者模式
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();  //打地基
    public abstract void buildWalls();  //砌墙
    public abstract void roofed();      //封顶

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
