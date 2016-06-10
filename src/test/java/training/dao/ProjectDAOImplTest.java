package training.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import training.model.Project;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 6/1/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations={"classpath:spring.xml"})

public class ProjectDAOImplTest {

    @Autowired
    private ProjectDAO projectDao;
    Project project1, project2, project3;

    @Before
    public void init(){

        project1 = new Project();
        project1.setTitle("TestProject1");
        project1.setDescription("TestProjectDescription1");
        project1.setLeadId(1001);

        project2 = new Project();
        project2.setTitle("TestProject2");
        project2.setDescription("TestProjectDescription2");
        project2.setLeadId(1002);

        project3 = new Project();
        project3.setTitle("TestProject3");
        project3.setDescription("TestProjectDescription3");
        project3.setLeadId(1003);
    }

    @Test
    @Transactional
    public void testAddProject() throws Exception {

        projectDao.add(project1);
        List<Project> selectedProject = projectDao.getByName(project1.getTitle());

        Assert.assertEquals(selectedProject.get(0).getTitle(), project1.getTitle());
    }

    @Test
    @Transactional
    public void testDelete() throws Exception {

    }

    @Test
    @Transactional
    public void testDelete1() throws Exception {

    }

    @Test
    @Transactional
    public void testDelete2() throws Exception {

    }

    @Test
    @Transactional
    public void testFindOne() throws Exception {

    }

    @Test
    @Transactional
    public void testGetByName() throws Exception {

        project1.setTitle("TestProject11");
        projectDao.add(project1);

        List<Project> selectedUser = projectDao.getByName(project1.getTitle());
        assertEquals(selectedUser.get(0).getTitle(), project1.getTitle());
    }

    @Test
    @Transactional
    public void testGetAll() throws Exception {

        int currentDBsize = projectDao.getAll().size();

        projectDao.add(project1);
        projectDao.add(project2);
        projectDao.add(project3);

        List<Project> allUsers = projectDao.getAll();

        assertEquals(currentDBsize + 3, allUsers.size());

    }
}