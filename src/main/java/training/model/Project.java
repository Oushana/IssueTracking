package training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */

public class Project extends DomainObject{


    private List<User> users = new ArrayList<User>();;

    private String projectTitle;
    private String projectDescription;
    private String projectLead;

    public Project(){}
    public Project( String projectTitle){
        this.projectTitle = projectTitle;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }



}
