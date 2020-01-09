package com.atguigu.iterator;

import com.atguigu.iterator.colleage.Colleage;
import com.atguigu.iterator.colleage.ComputerColleage;
import com.atguigu.iterator.output.OutPutImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/17:45
 */
public class Client{
    public static void main(String[] args) {
        //创建学院
        List<Colleage> colleages = new ArrayList<>();
        Colleage computerColleage = new ComputerColleage();
        colleages.add(computerColleage);

        OutPutImpl outPut = new OutPutImpl(colleages);
        outPut.printCollege();
    }
}
