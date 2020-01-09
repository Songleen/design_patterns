package com.atguigu.chainOfResponsibility.approver;

import com.atguigu.chainOfResponsibility.PurchaseRequest;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/19/18:14
 *
 * 请求的处理者
 */
public abstract class Approver {

    Approver approver;  //将自己关联进来——下一个处理者
    String name;    //名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，处理是由子类完成，因此做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
