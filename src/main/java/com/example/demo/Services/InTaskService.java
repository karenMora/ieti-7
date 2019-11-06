package com.example.demo.Services;

import com.example.demo.Model.Task;
import com.example.demo.Model.User;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface InTaskService {
    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task addTask(Task task);

    Task assignTaskToUser(String taskId, User user);

    void removeTask(String taskId);

    Task updateTask(Task task);
}
