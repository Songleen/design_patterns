package com.atguigu.brige.bank.transferWay;

import com.atguigu.brige.bank.userType.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:49
 */
public class OnlineTransfer extends TransferMethod {
    public OnlineTransfer(User user) {
        super(user);
    }

    @Override
    public void remit() {
        super.remit();
        System.out.println("网上转账");
    }
}
