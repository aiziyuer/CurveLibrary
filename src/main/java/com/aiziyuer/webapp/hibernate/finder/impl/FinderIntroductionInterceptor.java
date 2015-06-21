package com.aiziyuer.webapp.hibernate.finder.impl;

import com.aiziyuer.webapp.hibernate.finder.FinderExecutor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

/**
 * 查找类
 */
public class FinderIntroductionInterceptor implements IntroductionInterceptor {

    @Override
    public boolean implementsInterface(Class<?> cls) {
        return cls.isInterface() && FinderExecutor.class.isAssignableFrom(cls);
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        FinderExecutor executor = (FinderExecutor) methodInvocation.getThis();

        String methodName = methodInvocation.getMethod().getName();
        if (methodName.startsWith("find") || methodName.startsWith("list")) {
            Object[] arguments = methodInvocation.getArguments();
            return executor.executeFinder(methodInvocation.getMethod(), arguments);
        } else if (methodName.startsWith("iterate")) {
            Object[] arguments = methodInvocation.getArguments();
            return executor.iterateFinder(methodInvocation.getMethod(), arguments);
        }
//        else if(methodName.startsWith("scroll"))
//        {
//            Object[] arguments = methodInvocation.getArguments();
//            return executor.scrollFinder(methodInvocation.getMethod(), arguments);
//        }
        else {
            return methodInvocation.proceed();
        }
    }
}
