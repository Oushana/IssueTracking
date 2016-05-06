package training.service;

import training.model.Project;

import java.util.Set;


/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public interface ProjectService {

    public Set<Project> getAll();

    public  Project getByName( String name);



}
