package training.dao;

import org.springframework.stereotype.Repository;
import training.model.Issue;
import training.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Repository
public class IssueDAOImpl implements IssueDAO {


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
    public List<Issue> getIssueByReporterId(int id) {
        Query query;

        if (id > -1) {
            query = entityManager.createQuery("SELECT c FROM Issue c WHERE c.reporterId=:id", Issue.class);
            query.setParameter("id", id);
        } else {
            query = entityManager.createQuery("SELECT c FROM Issue c", Issue.class);
        }

        return (List<Issue>) query.getResultList();
    }


}

