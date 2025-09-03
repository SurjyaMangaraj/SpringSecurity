package com.thrilfix.SpringSecurity.Service;

import com.thrilfix.SpringSecurity.Model.User;

import java.util.List;

public interface UserService {

    public List<User> getList();

    public User getUser(String username);

    public User addUser(User user);
}
