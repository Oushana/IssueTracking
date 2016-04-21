package training.dao;


import training.model.Issue;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
interface IssueDAO {
    void add(Issue issue);
    void delete(Issue issue);
    void delete(long[] ids);
}
