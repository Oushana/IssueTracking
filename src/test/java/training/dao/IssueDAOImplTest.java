package training.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import training.model.Issue;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 6/1/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring.xml"})

public class IssueDAOImplTest {

    @Autowired
    IssueDAO issueDAO;

    Issue issue1, issue2, issue3;

    @Before
    public void init(){
       issue1 = new Issue(1001, "IssueTest1", 1002, "SomeIssueTest1", "OPEN", "LOW", 2001);
       issue2 = new Issue(1002, "IssueTest2", 1003, "SomeIssueTest2", "OPEN", "LOW", 2002);
       issue3 = new Issue(1003, "IssueTest3", 1004, "SomeIssueTest3", "OPEN", "LOW", 2003);
    }

    @Test
    @Transactional
    public void testAdd() throws Exception {
        issueDAO.add(issue1);
        List<Issue> selectedIssue = issueDAO.getIssueByReporterId(issue1.getReporterId());

        Assert.assertEquals(selectedIssue.get(0).getReporterId(), issue1.getReporterId());
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testDelete1() throws Exception {

    }

    @Test
    public void testDelete2() throws Exception {

    }

    @Test
    @Transactional
    public void testGetIssueByReporterId() throws Exception {
        issue1.setTitle("TestProject11");
        issueDAO.add(issue1);

        List<Issue> selectedIssue = issueDAO.getIssueByReporterId(issue1.getReporterId());
        assertEquals(selectedIssue.get(0).getReporterId(), issue1.getReporterId());
    }

    @Test
    @Transactional
    public void testGetAll() throws Exception {
        int currentDBsize = issueDAO.getAll().size();

        issueDAO.add(issue1);
        issueDAO.add(issue2);
        issueDAO.add(issue3);

        List<Issue> allIssues = issueDAO.getAll();

        assertEquals(currentDBsize + 3, allIssues.size());
    }
}