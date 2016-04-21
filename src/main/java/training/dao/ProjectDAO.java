package training.dao;

import training.model.Project;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
public interface ProjectDAO {
    void add(Project project);
    void delete(Project project);
    Project findOne(long id);
}
