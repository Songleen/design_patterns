package com.atguigu.command.order;

import com.atguigu.command.receiver.TVReceiver;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/14:48
 */
public class TVOffCommand implements Command {

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
