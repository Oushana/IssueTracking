package training.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */
@Entity
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue
    private Long p_id;

    // private List<User> users = new ArrayList<User>();
    private String title;
    private String description;
    private Long leadId;

    public Project() {
    }

    public Project(String projectTitle) {
        this.title = projectTitle;
    }

    public Long getProjectId() {
        return p_id;
    }

    public void setProjectId(Long projectId) {
        this.p_id = projectId;
    }

    public String getProjectTitle() {
        return title;
    }

    public void setProjectTitle(String projectTitle) {
        this.title = projectTitle;
    }

    public String getProjectDescription() {
        return description;
    }

    public void setProjectDescription(String projectDescription) {
        this.description = projectDescription;
    }

    public Long getProjectLead() {
        return leadId;
    }

    public void setProjectLead(Long projectLeadId) {
        this.leadId = projectLeadId;
    }

    @Override
    public String toString() {
        return getProjectId() + ": " + getProjectTitle() + "  [" + getProjectDescription() + "] - " + getProjectLead();
    }

}
