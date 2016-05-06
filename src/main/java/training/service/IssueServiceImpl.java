package training.service;


import training.dao.IssueDAO;
import training.dao.ProjectDAO;
import training.dao.UserDAO;
import training.model.Issue;
import training.model.Project;
import training.model.User;


/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
public class IssueServiceImpl implements IssueService{

    private IssueDAO issueDAO;

    public void addIssue(Issue issue) {
        issueDAO.add(issue);
    }

    public void deleteIssue(long[] ids) {
        issueDAO.delete(ids);
    }
}
