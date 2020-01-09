package com.atguigu.flyweight;

import com.atguigu.flyweight.externalState.User;
import com.atguigu.flyweight.flyweightFactory.WebSiteFactory;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/9:40
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory siteFactory = new WebSiteFactory();

        //以新闻的形式发布网站
        WebSite webSite1 = siteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2 = siteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));

        WebSite webSite3 = siteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("smith"));

        System.out.println("网站的分类共："+siteFactory.getWebSiteCount());
    }
}
