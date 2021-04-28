package com.atguigu.adapter.classAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/15:50
 *
 * 在适配器中，将220V的电压转成5V电压
 *
 * 注意：在此处，类适配器是继承Voltage220V
 *             对象适配器则是持有Voltage220V的实例，而不是继承(合成复用原则：用关联关系替代继承关系)
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int srcV = output220V();   //首先要获取到220v
        System.out.println("适配成5V!!!");
        int dstV = srcV/44;   //转成5V
        return dstV;
    }

    //这个方法在此处是否重写并没影响，因为重写后，也是调用父类中的方法
    @Override
    public int output220V() {
        return super.output220V();
    }
}
