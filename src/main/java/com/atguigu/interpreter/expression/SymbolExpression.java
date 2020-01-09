package com.atguigu.interpreter.expression;

import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/9:48
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
