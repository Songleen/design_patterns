package com.atguigu.interpreter.expression.concreteExpression;

import com.atguigu.interpreter.expression.Expression;
import com.atguigu.interpreter.expression.SymbolExpression;

import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/9:59
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left和right表达式相减后的结果
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
