package com.atguigu.adapter.objectAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/16:47
 */
public class HuaWei {

    public void charging(Voltage6V voltage6V){
        if (voltage6V.output6V() == 6){
            System.out.println("电压6V，可充电");
        }else if (voltage6V.output6V() != 6){
            System.out.println("电压不是6V，不能充电");
        }
    }
}
