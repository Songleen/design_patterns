package com.atguigu.decorator.afterDecorate;

import com.atguigu.decorator.component.Phone;
import com.atguigu.decorator.decorator.PhoneDecorator;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/18:26
 */
public class GiveCurrentTime extends PhoneDecorator {

    public GiveCurrentTime(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        getCurrentTime();
        super.call();

    }

    public void getCurrentTime(){
        System.out.println("现在时间是……六点半");
    }
}
