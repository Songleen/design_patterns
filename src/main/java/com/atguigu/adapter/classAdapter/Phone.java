package com.atguigu.adapter.classAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/15:52
 */
public class Phone {

    //在这里，依赖Voltage接口，其实就是依赖VoltageAdapter，因为适配器实现了Voltage接口
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if (voltage5V.output5V() >5){
            System.out.println("电压大于5v，不能充电");
        }
    }
}
