package dao;

import database.JDBCHelper;
import entity.Task;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

    private static final String INSERT_USER = "INSERT INTO users(userName, firstName, lastName) VALUES(?,?,?)";
    private static final String GET_ALL_USERS = "SELECT * FROM users";
    private static final String INSERT_TASK_TO_USER = "INSERT INTO task(userName, taskTitle, description) VALUES(?,?,?)";
    private static final String GET_ALL_USERS_TASKS = "SELECT * FROM task";

    Connection con;
    PreparedStatement ps;

    @Override
    public void createUser(User user) {

        try {
            con = JDBCHelper.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(INSERT_USER);

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());

            ps.execute();
            con.commit();

            JDBCHelper.closePreparedStatement(ps);
            JDBCHelper.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAllUsers(){

        List<User> list = new ArrayList<User>();
        ResultSet rs;
        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(GET_ALL_USERS);
            rs = ps.executeQuery(GET_ALL_USERS);

            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("userName"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                list.add(user);

                JDBCHelper.closePreparedStatement(ps);
                JDBCHelper.closeConnection(con);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void addTask(Task task) {

        try {
            con = JDBCHelper.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(INSERT_TASK_TO_USER);

            ps.setString(1, task.getUserName());
            ps.setString(2, task.getTitle());
            ps.setString(3, task.getDescription());

            ps.execute();
            con.commit();

            JDBCHelper.closePreparedStatement(ps);
            JDBCHelper.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Task> getAllUsersTasks() {
        List<Task> list = new ArrayList<Task>();
        ResultSet rs;

        try {
            con = JDBCHelper.getConnection();
            ps = con.prepareStatement(GET_ALL_USERS_TASKS);
            rs = ps.executeQuery(GET_ALL_USERS_TASKS);
            while (rs.next()) {
                Task task = new Task();
                task.setUserName(rs.getString("userName"));
                task.setTitle(rs.getString("taskTitle"));
                task.setDescription(rs.getString("description"));
                list.add(task);
            }
            JDBCHelper.closePreparedStatement(ps);
            JDBCHelper.closeConnection(con);

        }catch (SQLException e){
            e.printStackTrace();
        }

        return list;
    }
}
