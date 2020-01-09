package com.atguigu.interpreter.expression;

import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/9:40
 */
public abstract class Expression {
    // a+b-c,解释公式和数值，key就是公式，参数为a,b,c；value就是具体的值
    public abstract int interpreter(HashMap<String,Integer> var);
}
