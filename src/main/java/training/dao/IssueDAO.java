package training.dao;


import training.model.Issue;

import java.util.List;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
public interface IssueDAO {

    void add(Issue issue);

    void delete(Issue issue);

    List<Issue> getIssueByReporterId(int id);

    List<Issue> getAllIssues();
}
