package com.tedu.supermarket;

import com.tedu.supermarket.dao.UserMapper;
import com.tedu.supermarket.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class UMTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void getAll() {
        ArrayList<User> alluser = userMapper.getAllUser();
        System.out.println(alluser);
    }
}
