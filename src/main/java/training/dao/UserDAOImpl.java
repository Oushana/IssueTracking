package training.dao;

import org.springframework.stereotype.Repository;
import training.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

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
    public void delete(int[] ids) {
        User u;
        for (int id : ids) {
            u = entityManager.getReference(User.class, id);
            entityManager.remove(u);
        }
    }

    @Override
    public void delete(int id) {
        User u = entityManager.getReference(User.class, id);
        entityManager.remove(u);

    }

    @Override
    public List<User> getUserByEmail(String email) {

        Query query;

        if (!email.equalsIgnoreCase("")) {
            query = entityManager.createQuery("SELECT c FROM User c WHERE c.email=:email", User.class);
            query.setParameter("email", email);
        } else {
            query = entityManager.createQuery("SELECT c FROM User c", User.class);
        }

        return (List<User>) query.getResultList();

    }

    @Override
    public List<User> getAll() {

        Query query = entityManager.createQuery("SELECT c FROM User c", User.class);

        return (List<User>) query.getResultList();
    }

}
