package training.dao;


import training.model.Issue;

import java.util.List;

public interface IssueDAO {

    void add(Issue issue);

    void delete(Issue issue);

    void delete(int[] ids);
    void delete(int id);

    List<Issue> getIssueByReporterId(int id);

    List<Issue> getAll();
}
