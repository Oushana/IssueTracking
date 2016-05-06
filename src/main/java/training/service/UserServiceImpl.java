package training.service;

import training.dao.UserDAO;
import training.model.User;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public void addUser(User user) {
        userDAO.add(user);
    }

    public void deleteUser(long[] ids) {
        userDAO.delete(ids);
    }
}
