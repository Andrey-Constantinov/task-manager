import dao.UserDao;
import dao.UserDaoImpl;
import entity.Task;
import service.UserService;
import service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserServiceImpl(userDao);

//        User user = new User("2", "firstName", "lastName");
//        userService.createUser(user);

//        Task task = new Task("1", "newTask","taskDescription");
//        userService.addTask(task);

//        List<User> userList = userService.getAllUsers();
//        for (User users : userList) {
//            System.out.println("User's list: " + "\n" + users);
//        }

        List<Task> taskList = userService.getAllUsersTasks();
        for (Task usersTask : taskList) {
            System.out.println("Users task list: " + "\n" + usersTask);
        }
    }
}
