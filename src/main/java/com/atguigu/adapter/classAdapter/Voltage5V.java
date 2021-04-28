package com.atguigu.adapter.classAdapter;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/03/15:49
 * <p>
 * 因为适配器要继承被适配类，所以这里只能是接口(java的单继承)
 */
public interface Voltage5V {
    int output5V();
}
