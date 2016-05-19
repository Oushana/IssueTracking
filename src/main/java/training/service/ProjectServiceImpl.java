package training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training.dao.ProjectDAO;
import training.model.Project;

import java.util.List;
import java.util.Set;



@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    @Transactional
    public void addProject(Project project) {
        projectDAO.add(project);
    }

    @Transactional
    public void deleteProject(Project project) {
        projectDAO.delete(project);
    }

    @Transactional
    public List<Project> getAll() {
        return projectDAO.getAll();
    }

    @Transactional
    public List<Project> getByName(String title) {
        return projectDAO.getByName(title);
    }

    @Transactional(readOnly=true)
    public Project findProject(int id) {
        return projectDAO.findOne(id);
    }
}
