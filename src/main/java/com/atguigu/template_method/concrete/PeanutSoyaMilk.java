package com.atguigu.template_method.concrete;

import com.atguigu.template_method.template.SoyaMilk;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/10:56
 */
public class PeanutSoyaMilk extends SoyaMilk {

    @Override
    public void addComdiments() {
        System.out.println("加入上好的花生");
    }
}
