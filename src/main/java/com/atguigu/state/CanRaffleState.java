package com.atguigu.state;

import com.atguigu.state.activity.RaffleActivity;

import java.util.Random;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:36
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除过积分了");
    }

    @Override
    public boolean raffle() {
        //可以抽奖，抽完奖后，根据实际情况，改成新的状态
        System.out.println("正在抽奖，请稍等!!!");
        Random r = new Random();
        int num = r.nextInt(10);  //10%中奖机会
        if (num == 0) {
            activity.setState(activity.getDispenseState()); //改变活动状态为发放奖品
            return true;
        }else {
            System.out.println("很遗憾，未中奖……");
            activity.setState(activity.getNoRaffleState()); //改变活动状态为原始状态
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品……");
    }
}
