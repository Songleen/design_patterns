package com.atguigu.interpreter.expression.concreteExpression;

import com.atguigu.interpreter.expression.Expression;
import com.atguigu.interpreter.expression.SymbolExpression;
import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/10:06
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
