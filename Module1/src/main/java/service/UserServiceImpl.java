package service;


import dao.UserDao;
import entity.Task;
import entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    public UserServiceImpl(UserDao studentDao) {
        this.userDao = studentDao;
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
    }}
