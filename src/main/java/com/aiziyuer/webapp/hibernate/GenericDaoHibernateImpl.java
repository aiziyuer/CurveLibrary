package com.aiziyuer.webapp.hibernate;

import com.aiziyuer.webapp.framework.GenericDao;
import com.aiziyuer.webapp.hibernate.finder.FinderArgumentTypeFactory;
import com.aiziyuer.webapp.hibernate.finder.FinderExecutor;
import com.aiziyuer.webapp.hibernate.finder.FinderNamingStrategy;
import lombok.Data;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 */
@Data
public class GenericDaoHibernateImpl<T, PK extends Serializable>
        implements GenericDao<T, PK>, FinderExecutor {

    protected SessionFactory sessionFactory;

    protected FinderNamingStrategy namingStrategy;

    protected FinderArgumentTypeFactory argumentTypeFactory;

    protected Class<T> type;

    public GenericDaoHibernateImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PK create(T o) {
        return (PK) getSession().save(o);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T read(PK id) {
        return (T) getSession().get(type, id);
    }

    @Override
    public void update(T o) {
        getSession().update(o);
    }

    @Override
    public void delete(T o) {
        getSession().delete(o);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> executeFinder(Method method, final Object[] queryArgs) {
        final Query namedQuery = prepareQuery(method, queryArgs);
        return (List<T>) namedQuery.list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<T> iterateFinder(Method method, final Object[] queryArgs) {
        final Query namedQuery = prepareQuery(method, queryArgs);
        return (Iterator<T>) namedQuery.iterate();
    }

    private Query prepareQuery(Method method, Object[] queryArgs) {
        final String queryName = getNamingStrategy().queryNameFromMethod(type, method);
        final Query namedQuery = getSession().getNamedQuery(queryName);
        String[] namedParameters = namedQuery.getNamedParameters();
        if (namedParameters.length == 0) {
            setPositionalParams(queryArgs, namedQuery);
        } else {
            setNamedParams(namedParameters, queryArgs, namedQuery);
        }
        return namedQuery;
    }

    private void setPositionalParams(Object[] queryArgs, Query namedQuery) {
        // Set parameter. Use custom Hibernate Type if necessary
        if (queryArgs != null) {
            for (int i = 0; i < queryArgs.length; i++) {
                Object arg = queryArgs[i];
                Type argType = getArgumentTypeFactory().getArgumentType(arg);
                if (argType != null) {
                    namedQuery.setParameter(i, arg, argType);
                } else {
                    namedQuery.setParameter(i, arg);
                }
            }
        }
    }

    private void setNamedParams(String[] namedParameters, Object[] queryArgs, Query namedQuery) {
        // Set parameter. Use custom Hibernate Type if necessary
        if (queryArgs != null) {
            for (int i = 0; i < queryArgs.length; i++) {
                Object arg = queryArgs[i];
                Type argType = getArgumentTypeFactory().getArgumentType(arg);
                if (argType != null) {
                    namedQuery.setParameter(namedParameters[i], arg, argType);
                } else {
                    if (arg instanceof Collection) {
                        namedQuery.setParameterList(namedParameters[i], (Collection) arg);
                    } else {
                        namedQuery.setParameter(namedParameters[i], arg);
                    }
                }
            }
        }
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
