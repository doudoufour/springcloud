package com.user.service;

import com.user.dao.UserDaoServiceInterface;
import com.user.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserServiceInterface {
    @Autowired
    private UserDaoServiceInterface userDaoServiceInterface;
    @Override
    public User getUserByID(String id) {
        return userDaoServiceInterface.getUserById(id);
    }

    @Override
    public void save(User user) {
        userDaoServiceInterface.addUser(user);
    }
}
