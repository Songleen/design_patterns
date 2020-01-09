package com.atguigu.brige.bank.transferWay;

import com.atguigu.brige.bank.userType.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:55
 */
public class ATMTransfer extends TransferMethod {
    public ATMTransfer(User user) {
        super(user);
    }

    @Override
    public void remit() {
        super.remit();
        System.out.println("ATM转账");
    }
}
