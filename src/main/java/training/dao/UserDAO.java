package training.dao;

import training.model.User;

import java.util.List;


public interface UserDAO {

    void add(User user);

    void delete(User user);

    void delete(int[] ids);

    List<User> getUserByEmail(String email);

    List<User> getAllUsers();
}
