package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:10
 *
 * 房子的抽象建造者(里面有建造房子的方法)与房子本身分离
 * 抽象建造者：只负责建造的流程，不管建造的细节
 */
public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
