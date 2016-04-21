package training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training.model.Issue;
import training.model.Project;
import training.model.User;


/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
@Service
public class IssueService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private ProjectDAO projectDAO;
    @Autowired
    private IssueDAO issueDAO;

    @Transactional
    public void addUser(User user) {
        userDAO.add(user);
    }

    @Transactional
    public void addProject(Project project) {
        projectDAO.add(project);
    }

    @Transactional
    public void addIssue(Issue issue) {
        issueDAO.add(issue);
    }

    @Transactional
    public void deleteUser(long[] ids) {
        userDAO.delete(ids);
    }

    @Transactional
    public void deleteProject(Project project) {
        projectDAO.delete(project);
    }

    @Transactional
    public void deleteIssue(long[] ids) {
        issueDAO.delete(ids);
    }
}
