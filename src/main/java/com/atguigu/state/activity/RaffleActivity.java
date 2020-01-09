package com.atguigu.state.activity;

import com.atguigu.state.*;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/14:24
 */
public class RaffleActivity {

    //state表示活动当前的状态，是变化的
    private State state;

    //奖品数量
    int count = 0;

    //四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器，初始化当前状态为noRaffleState(不能抽奖状态)、初始化奖品数量
    public RaffleActivity(int count) {
        this.state = noRaffleState;
        this.count = count;
    }

    //扣分,调用当前状态的deductMoney
    public void deductMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        if (state.raffle()){
            //领取奖品
            System.out.println("恭喜中奖了……");
            state.dispensePrize();
            count--;
        }
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //每领取一次奖品，count--
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
