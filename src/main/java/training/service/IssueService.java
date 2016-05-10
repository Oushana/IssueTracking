package training.service;

import training.model.Issue;

import java.util.List;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */

public interface IssueService {

    void addIssue(Issue issue);

    void deleteIssue(Issue issue);

    List<Issue> getIssueByReporterId(int id);
}
