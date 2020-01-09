package com.atguigu.brige.bank.userType;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:45
 */
public class VIPUser implements User {
    @Override
    public void remit() {
        System.out.println("VIP用户寄钱");
    }
}
