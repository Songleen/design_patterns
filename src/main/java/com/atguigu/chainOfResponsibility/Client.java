package com.atguigu.chainOfResponsibility;

import com.atguigu.chainOfResponsibility.approver.CollegeApprover;
import com.atguigu.chainOfResponsibility.approver.DepartmentApprover;
import com.atguigu.chainOfResponsibility.approver.SchoolMasterApprover;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/19/18:49
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 3100, 1);

        //创建相关的审批人
        DepartmentApprover department = new DepartmentApprover("部门领导");
        CollegeApprover college = new CollegeApprover("学院领导");
        SchoolMasterApprover school = new SchoolMasterApprover("学校领导");

        //需要设置各个审批级别的下一个设置好(处理人构成环形)；
        department.setApprover(college);
        college.setApprover(school);
        school.setApprover(department);

        school.processRequest(request);
    }
}
