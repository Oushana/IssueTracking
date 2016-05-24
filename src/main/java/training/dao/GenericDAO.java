package training.dao;

import java.io.Serializable;
import java.util.List;

/**
 5/24/2016.
 */
public interface GenericDAO<T, PK extends Serializable> {

    void add(T t);

    void delete(T t);

    void delete(int[] ids);

    void delete(int id);

    T findById(int id);

    List<T> getByName(String title);

    List<T> getAll();

    List<T> getIssueByReporterId(int id);

    List<T> getUserByEmail(String email);

}
