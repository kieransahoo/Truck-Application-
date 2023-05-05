package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entities.User;
import com.demo.Repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        
        // saving a new User
        return userDao.save(user);
    }
}
