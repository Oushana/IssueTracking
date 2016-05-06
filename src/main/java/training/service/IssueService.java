package training.service;

import training.model.Issue;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public interface IssueService {
     void addIssue(Issue issue);
     void deleteIssue(long[] ids);
}
