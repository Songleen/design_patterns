package com.atguigu.flyweight.flyweightFactory;

import com.atguigu.flyweight.ConcreteWebSite;
import com.atguigu.flyweight.WebSite;

import java.util.HashMap;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/9:32
 */
public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个放入到池中
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数(池中有多少种网站类型)
    public int getWebSiteCount(){
        return pool.size();
    }
}
