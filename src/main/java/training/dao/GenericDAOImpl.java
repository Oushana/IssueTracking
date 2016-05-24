package training.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 5/24/2016.
 */
public class GenericDAOImpl<T, PK extends Serializable>
        implements GenericDAO<T, PK>  {
    @Override
    public void add(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void delete(int[] ids) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public T findById(int id) {
        return null;
    }

    @Override
    public List<T> getByName(String title) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public List<T> getIssueByReporterId(int id) {
        return null;
    }

    @Override
    public List<T> getUserByEmail(String email) {
        return null;
    }
}
