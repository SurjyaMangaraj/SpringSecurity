package com.thrilfix.SpringSecurity.Controller;

import com.thrilfix.SpringSecurity.Model.User;
import com.thrilfix.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    all user list
    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getList();
    }

//    get single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return userService.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }



}
