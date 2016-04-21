package training;

import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Created by Oksana_Eryomenko on 4/18/2016.
 */
public class GenericDaoHibernateImpl <T, PK extends Serializable>
        implements GenericDAO<T, PK> {
    private Class<T> type;
    protected SessionFactory sessionFactory;

    public GenericDaoHibernateImpl(Class<T> type) {
        this.type = type;
    }

    public T create(T entity) {
       // return (PK) getSession().save(o);
        sessionFactory.getCurrentSession().save(entity);
        return entity;
    }

    public T read(T id) {
        //return (T) getSession().get(type, id);
        return (T) sessionFactory.getCurrentSession().get(type, (Serializable) id);

    }

    public void update(T entity) {
        //getSession().update(o);
        sessionFactory.getCurrentSession().update(entity);
       // return entity;
    }

    public void delete(T entity) {
       // getSession().delete(o);
        if (entity != null) {
            sessionFactory.getCurrentSession().delete(entity);
        }
    }

    // Not showing implementations of getSession() and setSessionFactory()
}