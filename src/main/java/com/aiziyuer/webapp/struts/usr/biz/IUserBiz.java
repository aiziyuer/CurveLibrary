package com.aiziyuer.webapp.struts.usr.biz;

import com.aiziyuer.webapp.entity.user.User;

/**
 * 用户查询服务
 */
public interface IUserBiz {
    /** 根据用户名查找用户 */
    User findUser(String name);

    boolean isValidUser(String uname, String passwd);

}
