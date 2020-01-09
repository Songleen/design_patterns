package com.atguigu.facade.subsystem;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/12/20:11
 */
public class Stereo {

    //饿汉式创建单例，必须要加static，被修饰为static后，只要new B类的对象，第二个成员变量对象就会被放在静态区，
    // 而该对象中的第二个成员变量就不会在重新new了，因为它必须使用静态区的已经new好的这个对象
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("打开音响");
    }
    public void off(){
        System.out.println("关闭音响");
    }
    public void setVolumn(){
        System.out.println("调节音量");
    }
}
