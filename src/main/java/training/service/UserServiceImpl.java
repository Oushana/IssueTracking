package training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training.dao.UserDAO;
import training.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void addUser(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(User user) {
        int[] ids = new int[1];
        ids[0] = user.getU_id();
        delete(ids);
    }

    @Transactional(readOnly = true)
    public List<User> getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    @Override
    public List<User> getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Transactional
    public void delete(int[] ids) {
        userDAO.delete(ids);
    }

    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
