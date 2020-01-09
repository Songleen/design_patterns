package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:19
 *
 * 房子建造的指挥者，指定制作流程，返回产品
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程，交给指挥者，返回房子
    public House constructHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildBasic();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
