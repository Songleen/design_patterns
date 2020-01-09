package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:08
 */
public class House {
    private String houseName;
    private int housePrice;

    public House() {
    }

    public House(String houseName, int housePrice) {
        this.houseName = houseName;
        this.housePrice = housePrice;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }
}
