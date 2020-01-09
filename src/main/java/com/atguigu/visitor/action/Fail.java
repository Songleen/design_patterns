package com.atguigu.visitor.action;

import com.atguigu.visitor.person.Man;
import com.atguigu.visitor.person.Women;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/16:05
 */
public class Fail extends Operation {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给淘汰");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人给淘汰");
    }
}
