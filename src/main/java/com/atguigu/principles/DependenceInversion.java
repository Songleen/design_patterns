package com.atguigu.principles;

import org.junit.Test;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/07/27/16:06
 */
public class DependenceInversion {

    @Test
    public void test1() {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }

    @Test
    public void test2() {
        ChuangWei chuangWei = new ChuangWei();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(chuangWei);
        openAndClose2.open2();
    }

    @Test
    public void test3() {
        KangJia kangJia = new KangJia();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv3(kangJia);
        openAndClose3.open3();
    }
}


/**
 * 依赖传递的三种方式:通过接口传递、通过构造传递、通过setter传递
 */
//通过接口传递
interface IOpenAndClose {
    void open(ITv tv);
}

interface ITv {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITv tv) {
        tv.play();
    }
}

class ChangHong implements ITv {

    @Override
    public void play() {
        System.out.println("长虹电视机打开了");
    }
}

//通过构造传递
interface IOpenAndClose2 {
    void open2();
}

interface ITv2 {
    void play2();
}

class OpenAndClose2 implements IOpenAndClose2 {
    private ITv2 tv2;

    public OpenAndClose2(ITv2 tv2) {
        this.tv2 = tv2;
    }

    @Override
    public void open2() {
        this.tv2.play2();
    }
}

class ChuangWei implements ITv2 {

    @Override
    public void play2() {
        System.out.println("创维电视打开了");
    }
}

//通过setter传递
interface IOpenAndClose3 {
    void open3();
}

interface ITv3 {
    void play3();
}

class OpenAndClose3 implements IOpenAndClose3 {
    private ITv3 tv3;

    public void setTv3(ITv3 tv3) {
        this.tv3 = tv3;
    }

    @Override
    public void open3() {
        this.tv3.play3();
    }
}

class KangJia implements ITv3 {

    @Override
    public void play3() {
        System.out.println("康佳电视");
    }
}
