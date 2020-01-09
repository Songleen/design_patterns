package com.atguigu.builder.normal;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/13:57
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }

    @Override
    public void build() {
        super.build();
    }


}
