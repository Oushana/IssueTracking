package training.service;

import training.model.Issue;
import training.model.Project;

import java.util.List;

public interface IssueService {

    void addIssue(Issue issue);

    void deleteIssue(Issue issue);
    void delete(int[] ids);
    void delete(int id);

    List<Issue> getIssueByReporterId(int id);

    List<Issue> getAll();

    List<Issue> list(Project project);

}
