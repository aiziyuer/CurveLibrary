package com.aiziyuer.webapp.shiro.dao;

import com.aiziyuer.webapp.shiro.entity.User;

import java.util.List;

/**
 * 用户信息的DAO
 */
public interface IUserDao {

    User create(User user);

    User update(User user);

    void delete(Long userId);

    User find(Long userId);

    List<User> findAll();

    User findByUsername(String username);
}
