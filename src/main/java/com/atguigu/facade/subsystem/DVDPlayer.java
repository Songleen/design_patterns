package com.atguigu.facade.subsystem;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/12/20:14
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("打开DVD");
    }
    public void off(){
        System.out.println("关闭DVD");
    }
    public void play(){
        System.out.println("播放DVD");
    }
    public void pause(){
        System.out.println("暂停DVD");
    }
    public void setdvd(){
        System.out.println("调节DVD");
    }
}
