package com.aiziyuer.webapp.framework;

import com.aiziyuer.webapp.framework.util.ServiceLocator;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 封装一些简单的函数
 */
public abstract class BaseAction extends ActionSupport {

    /**
     * 页面请求对象
     */
    protected HttpServletRequest request = ServletActionContext.getRequest();

    /**
     * 页面链接session
     */
    protected HttpSession session = ServletActionContext.getRequest().getSession();

    /**
     * 后台Bean类管理类
     */
    protected ServiceLocator serviceLocator = ServiceLocator.getInstance();

}
