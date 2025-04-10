package com.imooc.spring.ioc.factory;

import com.imooc.spring.ioc.entity.Apple;

public class AppleStaticFactory {
    public static Apple createSweetApple(){
        Apple apple = new Apple();
        apple.setTitle("红富士");
        apple.setOrigin("欧洲");
        apple.setColor("白色");
        return apple;
    }
}
