package com.atguigu.command.order;

import com.atguigu.command.receiver.LightReceiver;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/14:10
 */
public class LightOnCommand implements Command {

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
