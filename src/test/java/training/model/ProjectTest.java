package training.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 6/1/2016.
 */
public class ProjectTest {

    Project project;

    @Before
    public void init(){
    project.setTitle("Project0");
    project.setDescription("someProject");
    project.setLeadId(1);
    }


    @Test
    public void testGetTitle() throws Exception {
        assertEquals("Project0", project.getTitle());
    }

    @Test
    public void testSetTitle() throws Exception {

    }

    @Test
    public void testGetDescription() throws Exception {
        assertEquals("someProject", project.getDescription());
    }

    @Test
    public void testSetDescription() throws Exception {

    }

    @Test
    public void testGetLeadId() throws Exception {
        assertEquals(1, project.getLeadId());
    }

    @Test
    public void testSetLeadId() throws Exception {

    }


}