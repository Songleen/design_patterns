package com.atguigu.adapter.objectAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/16:45
 * <p>
 * 注意：在此处，"类适配器"是继承Voltage330V
 * "对象适配器"则是持有Voltage330V的实例，而不是继承(合成复用原则：用关联关系替代继承关系)
 */
public class VoltageAdapter implements Voltage6V {

    private Voltage300V voltage300V;

    public VoltageAdapter(Voltage300V voltage300V) {
        this.voltage300V = voltage300V;
    }

    @Override
    public int output6V() {
        int i = voltage300V.output330V();   //获取到原始电压
        int j = i / 55;                     //转换成需要的
        return j;
    }
}
