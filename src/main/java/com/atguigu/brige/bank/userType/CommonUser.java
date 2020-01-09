package com.atguigu.brige.bank.userType;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:44
 */
public class CommonUser implements User {
    @Override
    public void remit() {
        System.out.println("普通用户寄钱");
    }
}
