package com.aiziyuer.webapp.control;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.rest.HttpHeaders;

import java.util.List;

/**
 * Restful 设计的Control类
 *
 */
public abstract class BaseController<E> extends ActionSupport implements ModelDriven<Object> {

    protected E data;

    protected List<E> dataList;

    /**
     * 获取 id 请求参数的方法
     */
    protected abstract void setId(int id);

    /**
     * 获取 id 请求参数的方法
     */
    protected abstract int getId();

    /**
     * 处理不带 id 参数的 GET 请求
     */
    protected abstract HttpHeaders index();

    /**
     * 处理带 id 参数的 GET 请求
     *
     */
    protected abstract HttpHeaders show();

    /**
     * 处理不带 id 参数的 POST 请求
     */
    protected abstract HttpHeaders create();

    /**
     * 处理不带 id 参数的 GET 请求
     */
    protected abstract String editNew();

    /**
     * 处理带 id 参数、且指定操作 edit 资源的 GET 请求
     */
    protected abstract String edit();

    /**
     * 处理带 id 参数的 PUT 请求
     */
    protected abstract String update();

    /**
     * 处理带 id 参数的 DELETE 请求
     */
    protected abstract String destroy();

    /**
     * 实现 ModelDriven 接口必须实现的 getModel 方法
     */
    @Override
    public Object getModel() {
        return (dataList != null ? dataList : data);
    }

}
