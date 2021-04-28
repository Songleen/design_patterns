package com.atguigu.brige;

import com.atguigu.brige.abstraction.FolderPhone;
import com.atguigu.brige.implementor.Vivo;
import com.atguigu.brige.implementor.Xiaomi;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/04/19:30
 *
 * 在这种情况下，想要增加手机类型(如滑盖手机),只需要在abstraction包中增加就行；
 *              想增加手机品牌，在implementor包下增加就行。
 *              这样无论是增加一款手机还是一个品牌，只会增加一个类。
 */
public class Client {
    public static void main(String[] args) {
        FolderPhone folderPhone = new FolderPhone(new Vivo());
        folderPhone.open();
        folderPhone.call();
        folderPhone.close();
        FolderPhone folderPhone1 = new FolderPhone(new Xiaomi());
        folderPhone1.open();
        folderPhone1.call();
        folderPhone1.close();
    }
}
