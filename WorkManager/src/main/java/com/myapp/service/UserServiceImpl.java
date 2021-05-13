package com.myapp.service;

import com.myapp.dao.UserDao;
import com.myapp.entity.Task;
import com.myapp.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) {

        userDao.createUser(user);
    }

    @Override
    public List<User> getAllUsers() {
       return userDao.getAllUsers();
    }

    @Override
    public void addTask(Task task) {
        userDao.addTask(task);
    }

    @Override
    public List<Task> getAllUsersTasks() { return userDao.getAllUsersTasks();
    }

}
