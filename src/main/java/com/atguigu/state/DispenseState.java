package com.atguigu.state;

import com.atguigu.state.activity.RaffleActivity;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:40
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能重复扣除积分……");
    }

    @Override
    public boolean raffle() {
        System.out.println("已经中奖了，正在发奖呢……");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount()>0){
            System.out.println("恭喜，奖品还有……"+activity.getCount());
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾，奖品已发放完毕……");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
