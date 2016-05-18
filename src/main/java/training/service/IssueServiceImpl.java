package training.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training.dao.IssueDAO;
import training.dao.ProjectDAO;
import training.dao.UserDAO;
import training.model.Issue;
import training.model.Project;
import training.model.User;

import java.util.List;


/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueDAO issueDAO;

    @Transactional
    public void addIssue(Issue issue) {
        issueDAO.add(issue);
    }

    @Transactional
    public void deleteIssue(Issue issue) {
        issueDAO.delete(issue);
    }

    @Override
    public List<Issue> getIssueByReporterId(int id) {
        return issueDAO.getIssueByReporterId(id);
    }

    @Transactional
    public List<Issue> getAllIssues() {
        return issueDAO.getAllIssues();
    }
}
