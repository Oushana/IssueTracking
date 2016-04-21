package training.dao;

import org.springframework.stereotype.Repository;
import training.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public void delete(long[] ids) {
        User c;
        for (long id : ids) {
            c = entityManager.getReference(User.class, id);
            entityManager.remove(c);
        }
    }
}
