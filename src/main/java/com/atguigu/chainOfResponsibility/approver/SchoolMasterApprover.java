package com.atguigu.chainOfResponsibility.approver;

import com.atguigu.chainOfResponsibility.PurchaseRequest;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/19/18:48
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000){
            System.out.println("请求编号id="+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
