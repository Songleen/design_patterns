package com.atguigu.facade.subsystem;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/12/20:16
 */
public class TheaterLights {
    private static TheaterLights instance = new TheaterLights();

    public static TheaterLights getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("打开影院灯光");
    }
    public void off(){
        System.out.println("关闭影院灯光");
    }
    public void dim(){
        System.out.println("调暗影院灯光");
    }
    public void bright(){
        System.out.println("调亮影院灯光");
    }
}
