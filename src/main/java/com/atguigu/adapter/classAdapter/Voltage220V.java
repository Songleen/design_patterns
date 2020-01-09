package com.atguigu.adapter.classAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/15:47
 * <p>
 * 被适配类
 */
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("电压" + src + "伏");
        return src;
    }
}
