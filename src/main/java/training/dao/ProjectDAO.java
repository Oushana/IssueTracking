package training.dao;

import training.model.Project;

import java.util.List;
import java.util.Set;

public interface ProjectDAO {

    void add(Project project);

    void delete(Project project);

    Project findOne(long id);

    List<Project> getByName(String title);

    List<Project> getAll();
}
