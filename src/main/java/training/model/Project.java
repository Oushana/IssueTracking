package training.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue
    private int p_id;


    private String title;
    private String description;
    private int leadId;
    // private List<User> users = new ArrayList<User>();

    public Project() {
    }

    public Project(String title, String description, int leadId){
        this.title = title;
        this.description = description;
        this.leadId = leadId;
    }
    public Project(String projectTitle) {
        this.title = projectTitle;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int projectId) {
        this.p_id = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String projectTitle) {
        this.title = projectTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String projectDescription) {
        this.description = projectDescription;
    }

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int projectLeadId) {
        this.leadId = projectLeadId;
    }

    @Override
    public String toString() {
        return getP_id() + ": " + getTitle() + "  [" + getDescription() + "] - " + getLeadId();
    }

}
