package com.atguigu.memorandum.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/19:12
 */
public class CareTaker2 {

    private List<Memo> memos = new ArrayList<>();

    public void addMemo(Memo memo){
        memos.add(memo);
    }

    public void getAttrList(){
        for (Memo memo : memos) {
            System.out.println("属性分别是："+memo.getDef()+"===="+memo.getVit());
        }
    }
}
