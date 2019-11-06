package com.example.demo.Persistence;

import com.example.demo.Model.Task;
import com.example.demo.Model.User;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public interface DataBaseRepository {

    List<User> getUsersList();
    User getUserById(String userId);
    User createUser(User user);
    User updateUser(User user);
    
    void removeUser(String userId);
    List<Task> geTasksList();
    Task getTaskById(String id);
    List<Task> getTasksByUserId(String userId);
    Task assignTaskToUser(String taskId, User user);
    
    void removeTask(String taskId);
    Task updateTask(Task task);
    Task addTask(Task task);
}