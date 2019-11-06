package com.example.demo.Services;


import com.example.demo.Model.User;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public interface IUserService {
    List<User> getUsersList();

    User getUserById(String userId);

    User createUser(User user);

    User updateUser(User user);

    void removeUser(String userId);
}
