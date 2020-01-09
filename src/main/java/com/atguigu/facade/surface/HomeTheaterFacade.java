package com.atguigu.facade.surface;

import com.atguigu.facade.subsystem.DVDPlayer;
import com.atguigu.facade.subsystem.Stereo;
import com.atguigu.facade.subsystem.TheaterLights;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/12/20:19
 */
public class HomeTheaterFacade {

    //定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Stereo stereo;
    private TheaterLights theaterLights;

    //构造器
    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLights = TheaterLights.getInstance();
    }

    //操作分四步
    public void ready(){
        theaterLights.on();
        theaterLights.bright();
        stereo.on();
        stereo.setVolumn();
        dvdPlayer.on();
        dvdPlayer.setdvd();
    }

    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        dvdPlayer.off();
        stereo.off();
        theaterLights.dim();
        theaterLights.off();
    }
}
