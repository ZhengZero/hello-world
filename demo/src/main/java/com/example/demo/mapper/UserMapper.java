package com.example.demo.mapper;

import com.example.demo.entity.User;

public interface UserMapper {

    User getInfo(String username, String password);

}
