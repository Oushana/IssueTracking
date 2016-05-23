package training.model;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.NavigableSet;
import java.util.TreeSet;


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

    public User(String username, String firstName, String lastName, String email) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int id) {
        this.u_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String userFirstName) {
        this.firstName = userFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String userLastName) {
        this.lastName = userLastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userUsername) {
        this.username = userUsername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String userEmail) {
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
        return getU_id() + ":" + getUsername() + " - " + getFirstName() + " " + getLastName() + " - " + getEmail();
    }

}
