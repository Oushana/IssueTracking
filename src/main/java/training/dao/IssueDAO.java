package training.dao;


import training.model.Issue;

import java.util.List;


public interface IssueDAO {

    void add(Issue issue);

    void delete(Issue issue);

    List<Issue> getIssueByReporterId(int id);

    List<Issue> getAllIssues();
}
