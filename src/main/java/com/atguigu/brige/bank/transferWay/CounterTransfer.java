package com.atguigu.brige.bank.transferWay;

import com.atguigu.brige.bank.userType.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:52
 */
public class CounterTransfer extends TransferMethod {
    public CounterTransfer(User user) {
        super(user);
    }

    @Override
    public void remit() {
        super.remit();
        System.out.println("柜台转账");
    }
}
