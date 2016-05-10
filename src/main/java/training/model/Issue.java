package training.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */
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
    private Long projectId;

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

    public int getId() {
        return i_id;
    }

    public void setId(int id) {
        this.i_id = id;
    }

    public int getIssueReporterId() {
        return reporterId;
    }

    public void setIssueReporterId(int issueReportedId) {
        this.reporterId = issueReportedId;
    }

    public int getIssueAsigneeId() {
        return asigneeId;
    }

    public void setIssueAsigneeId(int issueAsigneeId) {
        this.asigneeId = issueAsigneeId;
    }

    public String getIssueTitle() {
        return title;
    }

    public void setIssueTitle(String issueTitle) {
        this.title = issueTitle;
    }

    public String getIssueDescription() {
        return description;
    }

    public void setIssueDescription(String issueDescription) {
        this.description = issueDescription;
    }

    public String getIssueStatus() {
        return status;
    }

    public void setIssueStatus(String issueStatus) {
        this.status = issueStatus;
    }

    public String getIssuePriority() {
        return priority;
    }

    public void setIssuePriority(String issuePriority) {
        this.priority = issuePriority;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
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
        return getId() + ":asignee:[" + getIssueReporterId() + "]-" + getIssueTitle() + "-" + getIssueDescription() + "- reporter:[" + getIssueAsigneeId() + "] " + getIssuePriority() + " " + getIssueStatus();
    }
}
