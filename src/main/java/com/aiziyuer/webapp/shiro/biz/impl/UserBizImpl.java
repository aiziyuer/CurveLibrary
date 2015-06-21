package com.aiziyuer.webapp.shiro.biz.impl;

import com.aiziyuer.webapp.shiro.biz.IRoleBiz;
import com.aiziyuer.webapp.shiro.biz.IUserBiz;
import com.aiziyuer.webapp.shiro.dao.IUserDao;
import com.aiziyuer.webapp.shiro.entity.User;
import com.aiziyuer.webapp.framework.util.PasswordHelper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * 实现用户信息的交互
 */
@Data
public class UserBizImpl implements IUserBiz {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IRoleBiz roleBiz;

    @Autowired
    private PasswordHelper passwordHelper;


    public User create(User user) {
        return null;
    }

    public User update(User user) {
        return null;
    }

    public void delete(Long uid) {

    }

    public void changePasswd(Long uid, String newPasswd) {

    }

    public User find(Long uid) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public User findUserByName(String uname) {

        User usr = new User();
        usr.setUsername(uname);
        usr.setId(0l);
        usr.setPassword("123");
        usr.setSalt("salt");
        usr.getRoleIds().add(1l);
        new PasswordHelper().encryptPassword(usr);

        return usr;
    }

    public Set<String> findRoles(String uname) {
        return null;
    }

    public Set<String> findPermissions(String uname) {
        return null;
    }
}
