package com.atguigu.memorandum.game;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/15/19:06
 */
public class GameRole {
    private String vit;
    private String def;

    public String getVit() {
        return vit;
    }

    public void setVit(String vit) {
        this.vit = vit;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    //将状态保存到Memo中
    public void setAttrToMemo(){
        new Memo(vit,def);
    }

    public Memo getMemo(){
        return new Memo(vit,def);
    }
}
