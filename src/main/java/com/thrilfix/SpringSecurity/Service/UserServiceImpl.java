package com.thrilfix.SpringSecurity.Service;

import com.thrilfix.SpringSecurity.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements  UserService{

    List<User> list=new ArrayList<>();

    public UserServiceImpl(){
        list.add(new User(1L,"abc","abc","abc@gmail.com"));
        list.add(new User(2L,"xyz","xyz","xyz@gmail.com"));
        list.add(new User(3L,"aaa","aaa","aaa@gmail.com"));
    }
// get all user list
    public List<User> getList() {
        return list;
    }

//    get single user
    public User getUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

//    add new user
    public User addUser(User user){
            this.list.add(user);
            return user;
    }
}
