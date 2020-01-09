package com.atguigu.decorator.decorator;

import com.atguigu.decorator.component.Phone;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/18:13
 */
public abstract class PhoneDecorator implements Phone {
    private Phone phone;
    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
