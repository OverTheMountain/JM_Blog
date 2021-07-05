package com.blog.service;

import com.blog.dao.UserRepostiory;
import com.blog.po.User;
import com.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/7 21:10
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepostiory userRepostiory;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepostiory.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
