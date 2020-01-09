package com.atguigu.state;

import com.atguigu.state.activity.RaffleActivity;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:41
 */
public class DispenseOutState extends State{

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已发放完毕，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已发放完毕，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已发放完毕，请下次参加");
    }
}
