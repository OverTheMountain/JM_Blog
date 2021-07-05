package com.blog.service;

import com.blog.po.User;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/7 21:11
 */
public interface UserService {
    User checkUser(String username,String password);
}
