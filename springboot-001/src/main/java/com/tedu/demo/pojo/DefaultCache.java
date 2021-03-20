package com.tedu.demo.pojo;

import org.springframework.stereotype.Component;

/*
 业务逻辑类
 交给spring框架 注解
 */

@Component
public class DefaultCache {

    //spring管理对象默认是单例模式
    public DefaultCache(){
        System.out.println("spring正在创建对象");
    }

    private String info;

    public String getInfo(){
        return info;
    }

    public void  setInfo(String info){
        this.info=info;
    }
}
