package entity;

public class Task {

    private String userName;
    private String taskTitle;
    private String description;

    public Task() {
    }

    public Task(String userName, String title, String description) {
        this.userName = userName;
        this.taskTitle = title;
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return taskTitle;
    }

    public void setTitle(String title) {
        this.taskTitle = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", taskTitle='" + taskTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}