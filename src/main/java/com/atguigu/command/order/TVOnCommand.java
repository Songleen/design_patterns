package com.atguigu.command.order;

import com.atguigu.command.receiver.TVReceiver;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/14:47
 */
public class TVOnCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
