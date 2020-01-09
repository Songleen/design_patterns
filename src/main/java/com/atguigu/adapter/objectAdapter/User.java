package com.atguigu.adapter.objectAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/16:49
 */
public class User {
    public static void main(String[] args) {
        HuaWei huaWei = new HuaWei();
        huaWei.charging(new VoltageAdapter(new Voltage300V()));
    }
}
