package com.atguigu.decorator.afterDecorate;

import com.atguigu.decorator.component.Phone;
import com.atguigu.decorator.decorator.PhoneDecorator;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/21/18:16
 */
public class MusicHuawei extends PhoneDecorator {

    public MusicHuawei(Phone phone) {
        super(phone);
    }

    //定义想要扩展的功能
    public void playSong(){
        System.out.println("先播放一首歌曲……");
    }

    @Override
    public void call() {
        super.call();
        playSong();
    }
}
