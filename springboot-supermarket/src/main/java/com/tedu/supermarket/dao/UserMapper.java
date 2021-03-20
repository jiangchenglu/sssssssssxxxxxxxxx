package com.tedu.supermarket.dao;


import com.tedu.supermarket.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    public ArrayList<User> getAllUser();

    public ArrayList<User> queryUser(User user);

    public void registerUser(User user);

    public ArrayList<User> findUserByUserName(String name);
}
