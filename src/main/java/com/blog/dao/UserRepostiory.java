package com.blog.dao;

import com.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/7 21:14
 */
public interface UserRepostiory extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username,String password);
}
