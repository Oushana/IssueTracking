package training.service;

import training.model.Issue;

import java.util.List;



public interface IssueService {

    void addIssue(Issue issue);

    void deleteIssue(Issue issue);

    List<Issue> getIssueByReporterId(int id);

    List<Issue> getAllIssues();

}
