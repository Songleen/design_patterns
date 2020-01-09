package com.atguigu.template_method.concrete;

import com.atguigu.template_method.template.SoyaMilk;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/11:00
 */
public class RedBeanSoyaMilk extends SoyaMilk {

    @Override
    public void addComdiments() {
        System.out.println("加入上好的红豆");
    }
}
