package com.atguigu.template_method.template;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/10:48
 */
public abstract class SoyaMilk {

    //模板方法，用final修饰，不让子类去覆盖
    public final void make(){
        select();
        addComdiments();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：选择新鲜的黄豆");
    }

    //第二步，添加配料
    public abstract void addComdiments();

    void soak(){
        System.out.println("第三步：黄豆和配料需要浸泡，三小时");
    }

    void beat(){
        System.out.println("第四步：将黄豆和配料一块置于豆浆机中打碎");
    }

    //钩子方法：在父类中定义一个方法，默认不做任何事情，子类视情况要不要覆盖它
    protected boolean customerWantCondiments(){
        return true;
    }
}
