package com.aiziyuer.webapp.shiro.biz;

import com.aiziyuer.webapp.shiro.entity.User;

import java.util.List;
import java.util.Set;

/**
 * 用户相关的业务类
 */
public interface IUserBiz {

    User create(User user);

    User update(User user);

    void delete(Long uid);

    void changePasswd(Long uid, String newPasswd);

    User find(Long uid);

    List<User> findAll();

    User findUserByName(String uname);

    /**
     * 查找某个用户的角色
     * @param uname 用户名
     * @return 角色集合
     */
    Set<String> findRoles(String uname);

    /**
     *根据用户名查找
     * @param uname 用户名
     * @return 权限集合
     */
    Set<String> findPermissions(String uname);
}
