package com.atguigu.builder.builderPattern;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/14:24
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouseBuilder());
        houseDirector.setHouseBuilder(new CommonHouseBuilder());
        House house = houseDirector.constructHouse();
        System.out.println(house);
        System.out.println("--------------");

        //盖高楼
        houseDirector.setHouseBuilder(new HighBuildingBuilder());
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);
        /**
         * 注意：在追踪源码的时候，某些情况下代码设计的思想很相似，形式上和这儿的类图完全相同；
         *      程序员在编写代码的时候可能自己也不知道运用了某些设计模式。
         *//*
        StringBuilder stringBuilder = new StringBuilder("HELLO,WORLD!!");
        System.out.println(stringBuilder);*/
    }
}
