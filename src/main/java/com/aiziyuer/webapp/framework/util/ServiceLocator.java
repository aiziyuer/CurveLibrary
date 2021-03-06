package com.aiziyuer.webapp.framework.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 用于设置
 */
public class ServiceLocator implements BeanFactoryAware {

    private static BeanFactory beanFactory;
    private static ServiceLocator servlocator;

    private ServiceLocator()
    {
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        ServiceLocator.beanFactory = beanFactory;
    }

    public static synchronized ServiceLocator getInstance() {

        if (servlocator == null)
            servlocator = (ServiceLocator) beanFactory.getBean("serviceLocator");

        return servlocator;
    }

    /**
     * 根据提供的bean名称得到相应的服务类
     *
     * @param beanName bean名称
     */
    @SuppressWarnings("unchecked")
    public <T> T getService(String beanName) {
        return (T) beanFactory.getBean(beanName);
    }
}
