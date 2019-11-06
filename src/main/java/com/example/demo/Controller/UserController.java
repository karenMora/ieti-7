package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public ResponseEntity<?> getUsersList() {
        return new ResponseEntity<>(userService.getUsersList(),HttpStatus.ACCEPTED);
    }

    @RequestMapping(value="/user/{userid}", method=RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable String userId) {
        return new ResponseEntity<>(userService.getUserById(userId),HttpStatus.ACCEPTED);
    }

    @RequestMapping(value="/user", method=RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user),HttpStatus.CREATED);
    }

    @RequestMapping(value="/user/{userid}", method=RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(user),HttpStatus.OK);
    }

    @RequestMapping(value="/user/{userid}", method=RequestMethod.DELETE)
    public ResponseEntity<?> removeUser(@PathVariable String userId) {
        userService.removeUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}