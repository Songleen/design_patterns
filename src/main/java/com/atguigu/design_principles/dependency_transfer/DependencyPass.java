package com.atguigu.design_principles.dependency_transfer;

import org.junit.Test;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2020/01/09/16:16
 */
public class DependencyPass {
    public static void main(String[] args) {

    }
}

//通过Setter方法实现
interface IOpenAndClose{
    void open();
}
interface ITV{
    void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {

    }
}

/*//通过构造方法实现
interface IOpenAndClose{
    void open();
}
interface ITV{
    void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}*/

/*//通过接口实现依赖传递
interface IOpenAndClose{
    void open(ITV tv);
}

interface ITV{
    void play();
}

class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}*/
