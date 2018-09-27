package com.spd.springbootdemo.controller;


import com.spd.springbootdemo.dao.UserDao;
import com.spd.springbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserDao userDao;

    @RequestMapping("/userList")
    public List<User> getUserList(){
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
       return userDao.findAllUser();
    }
    @RequestMapping("/add")
    public String addUser(@RequestBody User user){
        if(user!=null){
            userDao.createUser(user);
            return "success";
        }else {
            return "error";
        }
    }

}
