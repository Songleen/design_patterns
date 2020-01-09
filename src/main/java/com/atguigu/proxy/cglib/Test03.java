package com.atguigu.proxy.cglib;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/11:14
 */
public class Test03 {
    public static void main(String[] args) {
        TeacherDao teacher = new TeacherDao();  //创建目标对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFatory(teacher).getProxyInstance(); //获取代理对象
        String res = proxyInstance.teach();//执行被代理对象的方法，触发intecept,从而实现对目标对象的调用
        System.out.println(res);

    }
}
