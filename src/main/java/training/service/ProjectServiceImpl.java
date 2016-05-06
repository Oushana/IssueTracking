package training.service;

import training.dao.ProjectDAO;
import training.model.Project;

import java.util.Set;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public class ProjectServiceImpl implements ProjectService{

    private ProjectDAO projectDAO;

    public void addProject(Project project) {
        projectDAO.add(project);
    }

    public void deleteProject(Project project) {
        projectDAO.delete(project);
    }

    @Override
    public Set<Project> getAll() {
        return null;
    }

    @Override
    public Project getByName(String name) {
        return null;
    }
}
