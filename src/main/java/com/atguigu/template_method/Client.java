package com.atguigu.template_method;

import com.atguigu.template_method.concrete.PeanutSoyaMilk;
import com.atguigu.template_method.concrete.RedBeanSoyaMilk;
import com.atguigu.template_method.template.SoyaMilk;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/11:02
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("---------------------");
        System.out.println("制作花生豆浆");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
