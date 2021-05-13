package com.myapp;

import com.myapp.dao.UserDaoImpl;
import com.myapp.dao.UserDao;
import com.myapp.entity.Task;
import com.myapp.entity.User;
import com.myapp.service.UserServiceImpl;
import com.myapp.service.UserService;
import com.myapp.singleton.Singleton;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserServiceImpl(userDao);

//        Task task = new Task("1","task","description");
//        userService.addTask(task);

//        User user = new User("1","fistName","lastName");
//        userService.createUser(user);

        //Singleton returns the same user
        //User singletonUser = Singleton.getInstance();
        //userService.createUser(singletonUser);

        List<User> list = userService.getAllUsers();
        for (User users: list) {
            System.out.println(users);
        }

//        List<Task> taskList = userService.getAllUsersTasks();
//        for (Task tasks : taskList) {
//            System.out.println(tasks);
//        }
    }
}
