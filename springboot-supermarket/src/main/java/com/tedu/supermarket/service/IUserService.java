package com.tedu.supermarket.service;

import com.tedu.supermarket.pojo.User;

import java.util.ArrayList;

public interface IUserService {
    public ArrayList<User> getAllUser();

    public int queryUser(User user);

    public void registerUser(User user);

    public int findUserByUserName(String name);

}
