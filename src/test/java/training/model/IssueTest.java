package training.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 6/1/2016.
 */
public class IssueTest {

    Issue issue;

    @Before
    public void init(){
        issue.setAsigneeId(1);
        issue.setReporterId(2);
        issue.setTitle("Issue0");
        issue.setDescription("someIssue");
        issue.setPriority("LOW");
        issue.setStatus("OPEN");
        issue.setProjectId(111);
    }

    @Test
    public void testGetReporterId() throws Exception {
        assertEquals(2, issue.getReporterId());
    }

    @Test
    public void testSetReporterId() throws Exception {

    }

    @Test
    public void testGetAsigneeId() throws Exception {
        assertEquals(1, issue.getAsigneeId());
    }

    @Test
    public void testSetAsigneeId() throws Exception {

    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals("Issue0", issue.getTitle());
    }

    @Test
    public void testSetTitle() throws Exception {

    }

    @Test
    public void testGetDescription() throws Exception {
        assertEquals("someIssue", issue.getDescription());
    }

    @Test
    public void testSetDescription() throws Exception {

    }

    @Test
    public void testGetStatus() throws Exception {
        assertEquals("OPEN", issue.getStatus());
    }

    @Test
    public void testSetStatus() throws Exception {

    }

    @Test
    public void testGetPriority() throws Exception {
        assertEquals("LOW", issue.getPriority());
    }

    @Test
    public void testSetPriority() throws Exception {

    }

    @Test
    public void testGetProjectId() throws Exception {
        assertEquals(111, issue.getProjectId());
    }

    @Test
    public void testSetProjectId() throws Exception {

    }

}