package com.atguigu.state;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:13
 */
public abstract class State {

    //扣除积分
    public abstract void deductMoney();

    //是否抽中奖品
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrize();
}
