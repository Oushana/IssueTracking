package training.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    private int u_id;

    // private Project project;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

    // private String userRole;
    // private NavigableSet<Issue> issues = new TreeSet<>();

    public User() {
    }

    public User(String userUsername, String userFirstName, String userLastName, String userEmail) {
        this.username = userUsername;
        this.firstName = userFirstName;
        this.lastName = userLastName;
        this.email = userEmail;

    }

    public int getId() {
        return u_id;
    }

    public void setId(int id) {
        this.u_id = id;
    }

    public String getUserFirstName() {
        return firstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.firstName = userFirstName;
    }

    public String getUserLastName() {
        return lastName;
    }

    public void setUserLastName(String userLastName) {
        this.lastName = userLastName;
    }

    public String getUserUsername() {
        return username;
    }

    public void setUserUsername(String userUsername) {
        this.username = userUsername;
    }

    public String getUserEmail() {
        return email;
    }

    public void setUserEmail(String userEmail) {
        this.email = userEmail;
    }

   /*  public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

   public NavigableSet<Issue> getIssues() {
        return issues;
    }

    public void setIssues(NavigableSet<Issue> issues) {
        this.issues = issues;
    }*/

    public String toString() {
        return getId() + ":" + getUserUsername() + " - " + getUserFirstName() + " " + getUserLastName() + " - " + getUserEmail();
    }

}
