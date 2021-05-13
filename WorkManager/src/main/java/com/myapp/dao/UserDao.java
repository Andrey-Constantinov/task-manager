package com.myapp.dao;

import com.myapp.entity.Task;
import com.myapp.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * method that creates a user
     * @param user - user class
     */
    void createUser(User user);

//TODO: JAVA DOC DOG...
    List<User> getAllUsers();
    void addTask(Task task);
    List<Task> getAllUsersTasks();

}