package com.atguigu.visitor.person;

import com.atguigu.visitor.action.Operation;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/15:58
 */
public class Women extends Person {

    @Override
    public void accept(Operation action) {
        action.getWomenResult(this);
    }

}
