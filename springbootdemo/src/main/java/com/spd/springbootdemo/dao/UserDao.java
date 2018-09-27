package com.spd.springbootdemo.dao;

import com.spd.springbootdemo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    /**
     * 新增用户
     * @param user
     */
    //@Insert("insert into user(id,username) VALUES(#{id},#{username})")
    void createUser(User user);

    /**
     * 查询用户列表
     * @return
     */
    //@Select("select * from user")
    List<User> findAllUser();
}
