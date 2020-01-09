package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:17
 *
 * 具体的建造者
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高层房子的基坑");
    }

    @Override
    public void buildWalls() {
        System.out.println("高层房子的墙");
    }

    @Override
    public void roofed() {
        System.out.println("高层房子的屋顶");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
