package com.atguigu.facade.client;

import com.atguigu.facade.surface.HomeTheaterFacade;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/12/20:29
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.ready();
        homeTheater.play();
        homeTheater.pause();
        homeTheater.end();
    }
}
