package com.myapp.service;

import com.myapp.entity.Task;
import com.myapp.entity.User;

import java.util.List;

public interface UserService {

    void createUser(User user);
    List<User> getAllUsers();
    void addTask(Task task);
    List<Task> getAllUsersTasks();

}
