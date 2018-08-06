package com.user.dao;

import com.user.po.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoServiceImpl implements  UserDaoServiceInterface{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserById(String id) {
        return userRepository.findOne(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
