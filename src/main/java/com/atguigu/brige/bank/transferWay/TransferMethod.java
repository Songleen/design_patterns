package com.atguigu.brige.bank.transferWay;

import com.atguigu.brige.bank.userType.User;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:46
 */
public abstract class TransferMethod {
    private User user;
    public TransferMethod(User user) {
        this.user = user;
    }
    public void remit(){
        user.remit();
    }
}
