package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:15
 *
 * 具体的建造者
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子地基三米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子的墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子的屋顶");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
