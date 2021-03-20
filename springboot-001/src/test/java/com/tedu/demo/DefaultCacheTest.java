package com.tedu.demo;

import com.tedu.demo.pojo.DefaultCache2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tedu.demo.pojo.DefaultCache;

@SpringBootTest
public class DefaultCacheTest {
    //测试SPRING是否管理 defaultCache对象

    @Autowired //从spring容器中取出对象
    private DefaultCache defaultCache;
    @Autowired
    private DefaultCache2 defaultCache2;
    @Autowired
    private DefaultCache defaultCache1;
    //单元测试
    @Test
    void testDefaultCache(){
        System.out.println("-------");
        System.out.println(defaultCache);
        defaultCache.setInfo("-----aaaaa");
        System.out.println(defaultCache.getInfo());
    }



}
