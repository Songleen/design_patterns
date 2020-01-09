package com.atguigu.composite;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/06/21:01
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "中国顶级大学");

        College civil = new College("土木工程学院", "搬砖的");
        College computer = new College("计算机学院", "搬代码的");

        Department java = new Department("软件工程", "java");
        Department security = new Department("安全工程", "黑客攻击");

        computer.add(java);
        computer.add(security);

        university.add(computer);
        university.add(civil);

        university.print();
    }
}
