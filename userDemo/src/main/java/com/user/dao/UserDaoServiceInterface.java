package com.user.dao;

import com.user.po.User;

public interface UserDaoServiceInterface {
    User getUserById(String id);
    void addUser(User user);
}
