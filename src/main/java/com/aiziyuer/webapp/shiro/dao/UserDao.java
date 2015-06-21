package com.aiziyuer.webapp.shiro.dao;

import com.aiziyuer.webapp.framework.GenericDao;
import com.aiziyuer.webapp.shiro.entity.User;

import java.util.List;

/**
 * 用户信息的DAO
 */
public interface UserDao extends GenericDao<User, Long> {

    List<User> findAll();

    User findByName(String username);

}
