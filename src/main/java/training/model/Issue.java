package training.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "Issues")
public class Issue {

    @Id
    @GeneratedValue
    private int i_id;

    private int reporterId;
    private int asigneeId;
    private String title;
    private String description;
    private String priority;
    private String status;
    private int projectId;

    // private String issueSummary;
    // private LocalDateTime issueCreationDate;
    //  private LocalDateTime issueTargetResolutionDate;
    //  private LocalDateTime issueActualResolutionDate;
    //  private LocalDateTime issueModifiedDate;

    public Issue() {
    }

    public Issue(int issueReporterId, String issueTitle) {
        this.reporterId = issueReporterId;
        this.title = issueTitle;
    }

    public Issue(int issueReporterId, String issueTitle, int asigneeId, String description, String status, String priority, int projectId) {
        this(issueReporterId, issueTitle);
        this.asigneeId = asigneeId;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.projectId = projectId;
    }


    public int getI_id() {
        return i_id;
    }

    public void setI_id(int id) {
        this.i_id = id;
    }

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int issueReportedId) {
        this.reporterId = issueReportedId;
    }

    public int getAsigneeId() {
        return asigneeId;
    }

    public void setAsigneeId(int issueAsigneeId) {
        this.asigneeId = issueAsigneeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String issueTitle) {
        this.title = issueTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String issueDescription) {
        this.description = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String issueStatus) {
        this.status = issueStatus;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String issuePriority) {
        this.priority = issuePriority;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

   /* public String getIssueSummary() {
        return issueSummary;
    }

    public void setIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
    }

    public LocalDateTime getIssueCreationDate() {
        return issueCreationDate;
    }

    public void setIssueCreationDate(LocalDateTime issueCreationDate) {
        this.issueCreationDate = issueCreationDate;
    }

    public LocalDateTime getIssueTargetResolutionDate() {
        return issueTargetResolutionDate;
    }

    public void setIssueTargetResolutionDate(LocalDateTime issueTargetResolutionDate) {
        this.issueTargetResolutionDate = issueTargetResolutionDate;
    }

    public LocalDateTime getIssueActualResolutionDate() {
        return issueActualResolutionDate;
    }

    public void setIssueActualResolutionDate(LocalDateTime issueActualResolutionDate) {
        this.issueActualResolutionDate = issueActualResolutionDate;
    }

    public LocalDateTime getIssueModifiedDate() {
        return issueModifiedDate;
    }

    public void setIssueModifiedDate(LocalDateTime issueModifiedDate) {
        this.issueModifiedDate = issueModifiedDate;
    }*/

    @Override
    public String toString() {
        return getI_id() + ":asignee:[" + getReporterId() + "]-" + getTitle() + "-" + getDescription() + "- reporter:[" + getAsigneeId() + "] " + getPriority() + " " + getStatus();
    }
}
