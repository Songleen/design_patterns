package com.atguigu.command.order;

import com.atguigu.command.receiver.LightReceiver;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/14:13
 */
public class LightOffCommand implements Command {

    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
