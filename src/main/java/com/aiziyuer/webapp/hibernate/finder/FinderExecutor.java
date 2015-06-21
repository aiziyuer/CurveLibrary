package com.aiziyuer.webapp.hibernate.finder;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/**
 * 查找器
 */
public interface FinderExecutor<T> {

    /**
     * Execute a finder method with the appropriate arguments
     */
    List<T> executeFinder(Method method, Object[] queryArgs);

    Iterator<T> iterateFinder(Method method, Object[] queryArgs);
}
