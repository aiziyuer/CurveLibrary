package com.aiziyuer.webapp.struts.usr.dao.impl;

import com.aiziyuer.webapp.entity.user.User;
import com.aiziyuer.webapp.struts.usr.dao.IUserDao;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息DAO
 */
@Data
public class UserDaoImpl implements IUserDao{

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public Serializable create(Object newInstance) {
        return null;
    }

    @Override
    public Object read(Serializable id) {
        return null;
    }

    @Override
    public void update(Object transientObject) {

    }

    @Override
    public void delete(Object persistentObject) {

    }
}
