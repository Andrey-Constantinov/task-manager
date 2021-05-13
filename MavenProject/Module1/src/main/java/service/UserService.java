package service;

import entity.Task;
import entity.User;

import java.util.List;

public interface UserService {

    /**
     * method that creates a user
     * @param user - user class
     */
    void createUser(User user);

    /**
     * method that shows All Users
     * @return List of Users
     */
    List<User> getAllUsers();

    /**
     * method that adds a new Task
     * @param task - task class
     */
    void addTask(Task task);

    /**
     * method that show user's tasks
     * @return
     */
    List<Task> getAllUsersTasks();
}
