package training.dao;

import org.springframework.stereotype.Repository;
import training.model.Project;
import training.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Repository
public class ProjectDAOImpl implements ProjectDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Project project) {
        entityManager.persist(project);
    }

    @Override
    public void delete(Project project) {
        entityManager.remove(project);
    }

    @Override
    public Project findOne(long id) {
        return entityManager.getReference(Project.class, id);

    }

    @Override
    public List<Project> getByName(String title) {
        Query query;

        if (!title.equalsIgnoreCase("")) {
            query = entityManager.createQuery("SELECT c FROM Project c WHERE c.title=:title", Project.class);
            query.setParameter("title", title);
        } else {
            query = entityManager.createQuery("SELECT c FROM Project c", Project.class);
        }

        return (List<Project>) query.getResultList();
    }

    @Override
    public List<Project> getAll() {
        Query  query = entityManager.createQuery("SELECT c FROM Project c", Project.class);

        return (List<Project>) query.getResultList();
    }
}
