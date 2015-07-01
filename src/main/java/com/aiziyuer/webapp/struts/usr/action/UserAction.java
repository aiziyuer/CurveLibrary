package com.aiziyuer.webapp.struts.usr.action;

import com.aiziyuer.webapp.framework.BaseAction;
import com.aiziyuer.webapp.framework.util.ServiceLocator;
import com.aiziyuer.webapp.struts.usr.biz.IUserBiz;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

/**
 * 登录类
 */
@EqualsAndHashCode(callSuper = false)
@Log4j2
public class UserAction extends BaseAction {

    @Setter
    private String username;

    @Setter
    private String email;

    @Setter
    private String password;

    @Setter
    private String rememberMe;

    /**
     * 用户登录
     */
    public String tryLogin() {

        //TODO 检查用户是否已经登录
        System.out.println("");

        log.info(request.getContextPath());
        log.info(session.getId());

        ServiceLocator serviceLocator = ServiceLocator.getInstance();
        IUserBiz userBiz = serviceLocator.getService("userBiz");
        boolean ret = userBiz.isValidUser(username, password);

        //TODO 检查是否需要登录，如果没有登录跳转到登录页面登录
        if (ret) {
            return SUCCESS;
        } else {
            return ERROR;
        }


        //TODO 用户登录，刷新Session

    }


    /**
     * 获取用户登录页面
     */
    public String login() {

        return SUCCESS;

    }

    /**
     * 用户注销
     */
    public String logout() {
        return SUCCESS;
    }

}
