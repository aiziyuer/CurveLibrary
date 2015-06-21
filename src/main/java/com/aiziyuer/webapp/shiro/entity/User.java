package com.aiziyuer.webapp.shiro.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息
 */
@Entity(name = "User")
@Table(name = "tbl_user")
@NamedQuery(name = "User.findByName", query = "select t from User t where t.username=:name")
@Data
public class User implements Serializable {

    /** 用户标识 */
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    /** 所属公司 */
    @Column(name = "organization_id")
    private Long organizationId;

    /** 用户名 */
    @Column(name = "username")
    private String username;

    /** 密码 */
    @Column(name = "password")
    private String password;

    /** 加密用的盐值 */
    @Column(name = "salt")
    private String salt;

    /** 角色列表 */
    @ElementCollection
    private List<Long> roleIds = new ArrayList<Long>();

    /** 是否有效 */
    @Column(name = "locked")
    private Boolean locked = Boolean.FALSE;

    /**用户名+盐值*/
    public String getCredentialsSalt() {
        return username + salt;
    }
}
