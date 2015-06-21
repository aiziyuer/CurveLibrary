package com.aiziyuer.webapp.hibernate.finder;

import org.hibernate.type.Type;

/**
 */
public interface FinderArgumentTypeFactory {
    Type getArgumentType(Object arg);
}
