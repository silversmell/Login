package com.example.login.Service;

import com.example.login.Model.User;
import com.example.login.Repository.UserDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class UserService {
    public static List<User> users = new ArrayList<>();
    private final UserDao userDao; //userrepository
    @Autowired
    public UserService(UserDao userDao){
        this.userDao=userDao;
    }
    public List<User> getAllUser(){
        return userDao.getAllUsers();
    }
    public User getUserByUserId(Long userId){
        return userDao.getUserByUserId(userId);
    }
    public void modifyUser(Long userId, User user){
        userDao.updateUser(userId,user);
    }
    public void removeUser(Long userId){
        userDao.deleteUser(userId);
    }
}

