package training.dao;

import org.springframework.stereotype.Repository;
import training.model.Issue;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Repository
public class IssueDAOImpl implements IssueDAO{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Issue issue) {
        entityManager.merge(issue);
    }

    @Override
    public void delete(Issue issue) {
        entityManager.remove(issue);
    }

    @Override
    public void delete(long[] ids) {
        Issue c;
        for (long id : ids) {
            c = entityManager.getReference(Issue.class, id);
            entityManager.remove(c);
        }
    }
}
