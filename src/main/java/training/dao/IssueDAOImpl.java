package training.dao;

import org.springframework.stereotype.Repository;
import training.model.Issue;
import training.model.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

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
    public void delete(int[] ids) {

       Issue issue;
        for (int id : ids) {
            issue = entityManager.getReference(Issue.class, id);
            entityManager.remove(issue);
        }
    }

    @Override
    public void delete(int id) {
        Issue issue = entityManager.getReference(Issue.class, id);
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

    @Override
    public List<Issue> getAll() {

        Query  query = entityManager.createQuery("SELECT c FROM Issue c", Issue.class);

        return (List<Issue>) query.getResultList();
    }


    @Override
    public List<Issue> list(Project project) {
        Query query;

        if (project != null) {
            query = entityManager.createQuery("SELECT c FROM Issue c WHERE c.projectId = :project", Issue.class);
            query.setParameter("project", project);
        } else {
            query = entityManager.createQuery("SELECT c FROM Issue c", Issue.class);
        }

        return (List<Issue>) query.getResultList();
    }
}

