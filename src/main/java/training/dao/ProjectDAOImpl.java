package training.dao;

import org.springframework.stereotype.Repository;
import training.model.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Repository
public class ProjectDAOImpl implements ProjectDAO{

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
}
