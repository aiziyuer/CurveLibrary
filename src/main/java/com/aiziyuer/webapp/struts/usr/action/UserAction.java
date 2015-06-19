package com.aiziyuer.webapp.struts.usr.action;

import com.aiziyuer.webapp.framework.BaseAction;
import com.aiziyuer.webapp.framework.ServiceLocator;
import com.aiziyuer.webapp.scripting.IRubyTester;
import com.aiziyuer.webapp.struts.usr.bo.UserInfo;
import com.sun.istack.internal.logging.Logger;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 登录类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserAction extends BaseAction {

    private final Logger logger = Logger.getLogger(UserAction.class);
    private String username;
    private String email;
    private String password;


    /**
     * 用户登录
     */
    public String tryLogin()
    {
        //TODO 检查用户是否已经登录
        System.out.println("");


        //TODO 用户登录，刷新Session

       return SUCCESS;
    }


    /**
     * 获取用户登录页面
     */
    public String login(){
        //TODO 检查是否需要登录，如果没有登录跳转到登录页面登录

        logger.info(request.getContextPath());
        logger.info(session.getId());

        ServiceLocator locator = serviceLocator.getService("serviceLocator");

        logger.info("serviceLocator: " + locator.getClass().toString());

        IRubyTester iRubyTester= serviceLocator.getService("rubyTester");

        String info = iRubyTester.sayHello();

        logger.info("info: "+info);


        UserInfo u = new UserInfo();
        u.setUName("a");

        logger.info(u.toString());


        return SUCCESS;
    }

    /**
     * 用户注销
     */
    public String logout(){
        return SUCCESS;
    }

}
