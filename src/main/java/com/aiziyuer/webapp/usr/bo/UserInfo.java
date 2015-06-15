package com.aiziyuer.webapp.usr.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 记录用户信息类
 */
@ToString
@EqualsAndHashCode
@Data
public class UserInfo {

    private String uName;

    private String uPasswd;
}
