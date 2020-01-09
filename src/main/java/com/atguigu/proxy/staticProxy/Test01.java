package com.atguigu.proxy.staticProxy;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/23/9:47
 */
public class Test01 {
    public static void main(String[] args) {
        ProxyTeacher proxyTeacher = new ProxyTeacher(new Teacher());
        proxyTeacher.teach();
    }
}
