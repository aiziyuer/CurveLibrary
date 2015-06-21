package com.aiziyuer.webapp.shiro.biz;

import com.aiziyuer.webapp.shiro.entity.Role;

import java.util.List;
import java.util.Set;

/**
 * 角色的各项操作
 */
public interface IRoleBiz {

    Role createRole(Role role);

    Role updateRole(Role role);

    void deleteRole(Long roleId);

    Role findOne(Long roleId);

    List<Role> findAll();

    /**
     * 根据角色编号得到角色标识符列表
     *
     * @param roleIds 角色列表
     * @return 角色集合
     */
    Set<String> findRoles(Long... roleIds);

    /**
     * 根据角色编号得到权限字符串列表
     *
     * @param roleIds 角色数组
     * @return 权限集合
     */
    Set<String> findPermissions(Long[] roleIds);


}
