package training.service;

import training.model.Project;

import java.util.List;
import java.util.Set;

public interface ProjectService {

    void addProject(Project project);

    void deleteProject(Project project);

    void delete(int[] ids);
    void delete(int id);

    List<Project> getAll();

    List<Project> getByName(String title);

    Project findProject(int id);

}
