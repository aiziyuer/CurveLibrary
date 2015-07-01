package com.aiziyuer.webapp.struts.usr.biz.impl;

import com.aiziyuer.webapp.entity.user.User;
import com.aiziyuer.webapp.struts.usr.biz.IUserBiz;
import com.aiziyuer.webapp.struts.usr.dao.IUserDao;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

/**
 * 用户服务
 */
@Log4j2
public class UserBizImp implements IUserBiz {

    @Setter
    private IUserDao userDao;

    @Override
    public User findUser(String name) {

        return userDao.findByName(name);
    }

    @Override
    public boolean isValidUser(String uname, String passwd) {

        User u = findUser(uname);

        log.info(String.format("%s", u));
        return false;
    }
}
