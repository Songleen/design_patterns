package com.atguigu.interpreter.expression;

import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/9:50
 */
public class VarExpression extends Expression {
    private String key; //key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    //var就是{a=10,b=20}
    //interpreter根据变量名，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var){
        return var.get(this.key);
    }
}
