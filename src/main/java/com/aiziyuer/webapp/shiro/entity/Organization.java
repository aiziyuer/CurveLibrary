package com.aiziyuer.webapp.shiro.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 组织
 */
@Data
public class Organization implements Serializable {

    /** 组织标识 */
    private Long id;

    /** 组织名称 */
    private String name;

    /** 父编号 */
    private Long parentId;

    /** 父编号列表 */
    private String parentIds;

    /** 标识是否有效 */
    private Boolean available = Boolean.FALSE;

}
