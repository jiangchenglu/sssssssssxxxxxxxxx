package com.tedu.demo.pojo;
//模拟延迟加载

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy //延迟加载 使用时才创建该对象
@Component //spring管理该对象
public class DefaultCache2 {

    public DefaultCache2(){
        System.out.println("正在创建defaultChche2对象");
    }
}
