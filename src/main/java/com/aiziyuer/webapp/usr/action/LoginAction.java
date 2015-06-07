package com.aiziyuer.webapp.usr.action;

import com.aiziyuer.webapp.framework.BaseAction;
import com.aiziyuer.webapp.framework.ServiceLocator;
import com.sun.istack.internal.logging.Logger;

/**
 * 登录类
 */
public class LoginAction extends BaseAction {

    private final Logger logger = Logger.getLogger(LoginAction.class);

    @Override
    public String execute() throws Exception {

        logger.info(request.getContextPath());
        logger.info(session.getId());

        ServiceLocator locator = serviceLocator.getService("serviceLocator");

        logger.info("serviceLocator: " + locator.getClass().toString());


        return SUCCESS;
    }

}
