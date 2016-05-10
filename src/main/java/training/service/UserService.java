package training.service;

import training.model.User;

import java.util.List;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public interface UserService {

    void addUser(User user);

    void delete(User user);

    void delete(int[] ids);

    List<User> getUserByEmail(String email);

    List<User> getUserById(int id);

    List<User> getAllUsers();

    String sayGreeting();
}
