package com.aiziyuer.webapp.usr.action;

import com.aiziyuer.webapp.framework.BaseAction;
import com.aiziyuer.webapp.framework.ServiceLocator;
import com.sun.istack.internal.logging.Logger;

/**
 * 登录类
 */
public class UserAction extends BaseAction {

    private final Logger logger = Logger.getLogger(UserAction.class);


    /**
     * 用户登录
     */
    public String login(){

        logger.info(request.getContextPath());
        logger.info(session.getId());

        ServiceLocator locator = serviceLocator.getService("serviceLocator");

        logger.info("serviceLocator: " + locator.getClass().toString());

        return SUCCESS;
    }

    /**
     * 用户注销
     */
    public String logout(){
        return SUCCESS;
    }

}
