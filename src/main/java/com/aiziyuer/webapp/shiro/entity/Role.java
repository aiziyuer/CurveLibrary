package com.aiziyuer.webapp.shiro.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 角色
 */
@Data
public class Role implements Serializable {

    /** 编号 */
    private Long id;

    /** 角色标识 程序中判断使用,如"admin" */
    private String role;

    /** 角色描述,UI界面显示使用 */
    private String description;

    /** 拥有的资源 */
    private List<Long> resourceIds;

    /** 是否可用,如果不可用将不会添加给用户 */
    private Boolean available = Boolean.FALSE;

}
