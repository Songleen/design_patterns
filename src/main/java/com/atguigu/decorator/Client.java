package com.atguigu.decorator;

import com.atguigu.decorator.afterDecorate.GiveCurrentTime;
import com.atguigu.decorator.afterDecorate.MusicHuawei;
import com.atguigu.decorator.component.Huawei;
import com.atguigu.decorator.component.Phone;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/18:15
 */
public class Client {
    public static void main(String[] args) {
        Phone huawei = new Huawei();

        huawei = new GiveCurrentTime(huawei);
        huawei = new MusicHuawei(huawei);
        huawei.call();
    }
}
