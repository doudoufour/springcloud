package com.user.service;

import com.user.po.User;

public interface UserServiceInterface {
    User getUserByID(String id);
    void save(User user);
}
