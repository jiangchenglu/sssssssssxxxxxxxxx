package com.tedu.supermarket.service;

import com.tedu.supermarket.dao.UserMapper;
import com.tedu.supermarket.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public ArrayList<User> getAllUser() {
        ArrayList<User> allUser = userMapper.getAllUser();
        return null;
    }
    @Override
    public int queryUser(User user) {
        ArrayList<User> users = userMapper.queryUser(user);
        int length=users.size();
        return length;
    }

    @Override
    public void registerUser(User user) {
        userMapper.registerUser(user);
    }

    @Override
    public int findUserByUserName(String name) {
        ArrayList<User> userByUserName = userMapper.findUserByUserName(name);
        int size = userByUserName.size();
        return size;
    }
}
