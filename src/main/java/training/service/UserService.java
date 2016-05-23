package training.service;

import training.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void delete(User user);

    void delete(int[] ids);

    List<User> getUserByEmail(String email);

    List<User> getUserById(int id);

    List<User> getAll();

    String sayGreeting();
}
