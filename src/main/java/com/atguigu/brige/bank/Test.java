package com.atguigu.brige.bank;

import com.atguigu.brige.bank.transferWay.ATMTransfer;
import com.atguigu.brige.bank.transferWay.CounterTransfer;
import com.atguigu.brige.bank.transferWay.OnlineTransfer;
import com.atguigu.brige.bank.userType.VIPUser;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:53
 */
public class Test {
    public static void main(String[] args) {
        CounterTransfer ct = new CounterTransfer(new VIPUser());
        ct.remit();
        OnlineTransfer ot = new OnlineTransfer(new VIPUser());
        ot.remit();
        ATMTransfer at = new ATMTransfer(new VIPUser());
        at.remit();
    }
}
