package training.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 6/1/2016.
 */
public class UserTest {

    User user;

    @Before
    public void init() {
        user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("aaa@aaa.com");
        user.setUsername("johnDoe");
    }


    @Test
    public void testGetFirstName() throws Exception {
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void testSetFirstName() throws Exception {
        user.setFirstName("john1");
        assertEquals("john1", user.getFirstName());
    }

    @Test
    public void testGetLastName() throws Exception {
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void testSetLastName() throws Exception {

    }

    @Test
    public void testGetUsername() throws Exception {
        assertEquals("johnDoe", user.getUsername());
    }

    @Test
    public void testSetUsername() throws Exception {

    }

    @Test
    public void testGetEmail() throws Exception {

    }

    @Test
    public void testSetEmail() throws Exception {
        assertEquals("aaa@aaa.com", user.getEmail());
    }

    @Test
    public void testToString() throws Exception {

    }
}