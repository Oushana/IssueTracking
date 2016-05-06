package training.model;


import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */

public class User extends DomainObject{


    private Project project;

    private String userUsername;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userRole;

    private NavigableSet<Issue> issues = new TreeSet<>();

    public User(){}
    public User(String userUsername, String userFirstName, String userLastName, String userEmail){
        this.userUsername = userUsername;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;

    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRole() {
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
    }

public String toString(){
    return getUserUsername() + " - " + getUserFirstName() + getUserLastName() + " - " + getUserEmail();
}

}
