package com.example.demo.Services;
import com.example.demo.Model.User;
import com.example.demo.Persistence.DataBaseRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    DataBaseRepository dataBaseRepository;

    @Override
    public List<User> getUsersList() {
        return dataBaseRepository.getUsersList();
    }

    @Override
    public User getUserById(String userId) {
        return dataBaseRepository.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        return dataBaseRepository.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return dataBaseRepository.updateUser(user);
    }

    @Override
    public void removeUser(String userId) {
        dataBaseRepository.removeUser(userId);

    }

}
