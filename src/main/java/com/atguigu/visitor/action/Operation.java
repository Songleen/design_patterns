package com.atguigu.visitor.action;

import com.atguigu.visitor.person.Man;
import com.atguigu.visitor.person.Women;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/15:54
 */
public abstract class Operation {
    public abstract void getManResult(Man man);
    public abstract void getWomenResult(Women women);
}
