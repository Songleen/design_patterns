package com.atguigu.command;

import com.atguigu.command.order.LightOffCommand;
import com.atguigu.command.order.LightOnCommand;
import com.atguigu.command.receiver.LightReceiver;
import com.atguigu.command.remoteController.RemoteController;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/14:53
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，使用遥控器，完成对电灯的操作
        //1、创建电灯对象(接收者)
        LightReceiver light = new LightReceiver();

        //2、创建电灯相关的命令开关
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        //3、创建一个遥控器
        RemoteController remote = new RemoteController();

        //4、给遥控器设置命令，比如 no=0是电灯的开和关操作
        remote.setCommand(0, lightOnCommand, lightOffCommand);

        //5、按下灯的开和关按钮
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        System.out.println("==========使用电视遥控器===========类似");
    }
}
