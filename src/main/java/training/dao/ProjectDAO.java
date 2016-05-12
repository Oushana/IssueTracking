package training.dao;

import training.model.Project;

import java.util.List;
import java.util.Set;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */
public interface ProjectDAO {

    void add(Project project);

    void delete(Project project);

    Project findOne(long id);

    List<Project> getByName(String title);

    Set<Project> getAll();
}
