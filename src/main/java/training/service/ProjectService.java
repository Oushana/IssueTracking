package training.service;

import training.model.Project;

import java.util.List;
import java.util.Set;


/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public interface ProjectService {

    void addProject(Project project);

    void deleteProject(Project project);

    Set<Project> getAll();

    List<Project> getByName(String title);

}
