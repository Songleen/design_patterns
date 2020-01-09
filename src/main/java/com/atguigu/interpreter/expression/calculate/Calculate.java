package com.atguigu.interpreter.expression.calculate;

import com.atguigu.interpreter.expression.Expression;
import com.atguigu.interpreter.expression.VarExpression;
import com.atguigu.interpreter.expression.concreteExpression.AddExpression;
import com.atguigu.interpreter.expression.concreteExpression.SubExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/16/10:14
 */
public class Calculate {

    //定义表达式
    private Expression expression;

    //构造参数传参并解析
    public Calculate(String expStr) {  //expStr = a + b

        //先设置运算顺序
        Stack<Expression> stack = new Stack<>();

        //表达式拆分成字符数组
        char[] chars = expStr.toCharArray();    //a,+,b

        Expression left = null;
        Expression right = null;

        for (char aChar : chars) {
            switch (aChar){
                case '+':
                    left = stack.pop(); //从stack取出left => "a"
                    right = new VarExpression(String.valueOf(aChar));
                    stack.push(new AddExpression(left,right));//根据得到left和right构建AddExpression加入stack
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(aChar));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果是一个Var就创建要给VarExpression对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(aChar)));
                    break;
            }
        }
        //当遍历完整个chars数组后，stack就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        //将表达式a+b和var={a=10,b=20}，然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
