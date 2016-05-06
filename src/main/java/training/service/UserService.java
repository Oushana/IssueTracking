package training.service;

import training.model.User;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public interface UserService {

     void addUser(User user);

     void deleteUser(long[] ids);
}
