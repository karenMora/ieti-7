package com.example.demo.Services;

import com.example.demo.Model.Task;
import com.example.demo.Model.User;
import com.example.demo.Persistence.DataBaseRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class TaskPlanerServiceImp implements InTaskService {

    @Autowired
    DataBaseRepository dataBaseRepository;

    @Override
    public List<Task> geTasksList() {
        return dataBaseRepository.geTasksList();
    }

    @Override
    public Task getTaskById(String id) {
        return dataBaseRepository.getTaskById(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return dataBaseRepository.getTasksByUserId(userId);
    }
    
    @Override
    public void removeTask(String taskId) {
        dataBaseRepository.removeTask(taskId);

    }

    @Override
    public Task updateTask(Task task) {
        return dataBaseRepository.updateTask(task);
    }

    @Override
    public Task addTask(Task task) {
        return dataBaseRepository.addTask(task);
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return dataBaseRepository.assignTaskToUser(taskId, user);
    }

}
