package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryUserList();
}
