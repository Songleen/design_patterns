package com.atguigu.state;

import com.atguigu.state.activity.RaffleActivity;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/15:30
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity ra = new RaffleActivity(5);

        for (int i = 0; i < 100; i++) {
            System.out.println("-----第"+(i+1)+"次抽奖-----");
            ra.deductMoney();   //第一步，扣积分
            ra.raffle();        //抽奖
        }
    }
}
