package com.aiziyuer.webapp.entity.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 资源
 */
@Data
public class Resource implements Serializable{

    /** 资源标识 */
    private Long id;

    /** 资源名称 */
    private String name;

    /** 资源类型 */
    private ResourceType type = ResourceType.menu;

    /** 资源路径 */
    private String url;

    /** 权限字符串 */
    private String permission;

    /** 父编号 */
    private Long parentId;

    /** 父编号列表 */
    private String parentIds;

    /** 是否有效 */
    private Boolean available = Boolean.FALSE;

    public enum ResourceType {
        menu("菜单"), button("按钮");

        private final String info;

        ResourceType(String info) {
            this.info = info;
        }

        public String info() {
            return info;
        }
    }
}
