package com.atguigu.memorandum.game;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/19:15
 */
public class Client {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.setVit("状态1：伤害800");
        role.setDef("状态1：防御800");

        role.setAttrToMemo();

        CareTaker2 c2 = new CareTaker2();
        c2.addMemo(role.getMemo());
        //c2.getAttrList();

        role.setVit("状态2：伤害400");
        role.setDef("状态2：防御400");
        c2.addMemo(role.getMemo());
        //c2.getAttrList();
        System.out.println(role.getVit());
        System.out.println(role.getDef());

    }
}
