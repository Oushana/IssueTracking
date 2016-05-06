package training.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */

public class Issue extends DomainObject {

    private int issueReporterId;
    private int issueAsigneeId;

    private String issueTitle;
    private String issueDescription;
    private String issueStatus;
    private IssuePriority issuePriority;
    private String issueSummary;

    private LocalDateTime issueCreationDate;
    private LocalDateTime issueTargetResolutionDate;
    private LocalDateTime issueActualResolutionDate;
    private LocalDateTime issueModifiedDate;

    public Issue(){}

    public Issue(int issueReporterId, String issueTitle){
        this.issueReporterId = issueReporterId;
        this.issueTitle = issueTitle;
    }



    public int getIssueReportedId() {
        return issueReporterId;
    }

    public void setIssueReportedId(int issueReportedId) {
        this.issueReporterId = issueReportedId;
    }

    public int getIssueAsigneeId() {
        return issueAsigneeId;
    }

    public void setIssueAsigneeId(int issueAsigneeId) {
        this.issueAsigneeId = issueAsigneeId;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public IssuePriority getIssuePriority() {
        return issuePriority;
    }

    public void setIssuePriority(IssuePriority issuePriority) {
        this.issuePriority = issuePriority;
    }

    public String getIssueSummary() {
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
    }


}
