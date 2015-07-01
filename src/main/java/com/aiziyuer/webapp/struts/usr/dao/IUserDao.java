package com.aiziyuer.webapp.struts.usr.dao;

import com.aiziyuer.webapp.entity.user.User;
import com.aiziyuer.webapp.framework.GenericDao;

/**
 * 用户信息接口
 */
public interface IUserDao extends GenericDao {
    User findByName(String name);
}
