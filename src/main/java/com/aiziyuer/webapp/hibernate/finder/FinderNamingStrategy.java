package com.aiziyuer.webapp.hibernate.finder;

import java.lang.reflect.Method;

/**
 */
public interface FinderNamingStrategy {

    String queryNameFromMethod(Class findTargetType, Method finderMethod);
}
