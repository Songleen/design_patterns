package com.atguigu.state;

import com.atguigu.state.activity.RaffleActivity;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:20
 */
public class NoRaffleState extends State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        //当前状态可以扣积分，扣除后，将状态设置成抽奖状态
        System.out.println("扣除50积分成功，你可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        //当前状态不能抽奖
        System.out.println("扣除积分才能抽奖哟！！");
        return false;
    }

    @Override
    public void dispensePrize() {
        //当前状态不能发奖
        System.out.println("不能发放奖品哟！！！");
    }
}
