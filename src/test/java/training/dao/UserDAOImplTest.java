package training.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import training.model.User;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 6/1/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring.xml"})

public class UserDAOImplTest {

    @Autowired
    private UserDAO userDAO;
    User user1, user2, user3, user4;

    @Before
    public void init() {

        user1 = new User();
        user1.setFirstName("TestJohn1");
        user1.setLastName("TestDoe1");
        user1.setEmail("aaa1@aaa.com");
        user1.setUsername("johnDoe1");

        user2 = new User();
        user2.setFirstName("TestJohn2");
        user2.setLastName("TestDoe2");
        user2.setEmail("aaa2@aaa.com");
        user2.setUsername("johnDoe2");

        user3 = new User();
        user3.setFirstName("TestJohn3");
        user3.setLastName("TestDoe3");
        user3.setEmail("aaa3@aaa.com");
        user3.setUsername("johnDoe3");

        user4 = new User();
        user4.setFirstName("TestJohn4");
        user4.setLastName("TestDoe4");
        user4.setEmail("aaa4@aaa.com");
        user4.setUsername("johnDoe4");
    }

    @Test
    @Transactional
    public void testAddUser() throws Exception {

        userDAO.add(user1);
        List<User> selectedUser = userDAO.getUserByEmail(user1.getEmail());
        Assert.assertEquals(selectedUser.get(0).getUsername(), user1.getUsername());
    }

    @Test
    @Transactional
    public void testGetUserByEmail() throws Exception {

        user1.setEmail("bbb@bbb.com");
        userDAO.add(user1);

        List<User> selectedUser = userDAO.getUserByEmail(user1.getEmail());
        assertEquals(selectedUser.get(0).getEmail(), user1.getEmail());
    }

    @Test
    @Transactional
    public void testGetAll() throws Exception {

        int currentDBsize = userDAO.getAll().size();

        userDAO.add(user1);
        userDAO.add(user2);
        userDAO.add(user3);

        List<User> allUsers = userDAO.getAll();

        assertEquals(currentDBsize + 3, allUsers.size());
    }

    @Test //void delete(User user);
    @Transactional
    public void testDelete() throws Exception {

        // int currentDBsize = userDAO.getAll().size();

        //  userDAO.add(user4);
        //  System.out.println("adding user3");
        //  assertEquals("After adding user3", currentDBsize+1, userDAO.getAll().size());

        // userDAO.delete(user4);

        // System.out.println("removing user3");
        // assertEquals("After removing user3",currentDBsize, userDAO.getAll().size());

        //assertNull("object doesnt exist - good", userDAO.getUserByEmail(user3.getEmail()));


    }

    @Test //void delete(int[] ids);
    @Transactional
    public void testDelete1() throws Exception {

    }

    @Test //   void delete(int id);
    @Transactional
    public void testDelete2() throws Exception {

    }
}
