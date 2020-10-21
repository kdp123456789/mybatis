package com.kuai.dao;

import com.kuai.pojo.User;

import java.util.List;

public interface UserDao {

    void save();

    List<User> getListUser();

}
