package com.aiziyuer.webapp.shiro.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息
 */
@Data
public class User implements Serializable {

    /** 用户标识 */
    private Long id;

    /** 所属公司 */
    private Long organizationId;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 加密用的盐值 */
    private String salt;

    /** 角色列表 */
    private List<Long> roleIds = new ArrayList<Long>();

    /** 是否有效 */
    private Boolean locked = Boolean.FALSE;

    /**用户名+盐值*/
    public String getCredentialsSalt() {
        return username + salt;
    }
}
