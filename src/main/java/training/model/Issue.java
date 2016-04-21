package training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Oksana_Eryomenko on 4/15/2016.
 */
@Entity
@Table(name="Issue")
public class Issue {

    @Id
    @GeneratedValue
    private int issueId;

    private int issueReportedId;
    private int issueAsigneeId;

    private String issueTitle;
    private String issueDescription;
    private String issueStatus;
    private String issuePriority;
    private String issueSummary;

    private Date issueCreationDate;
    private Date issueTargetResolutionDate;
    private Date issueActualResolutionDate;
    private Date issueModifiedDate;

    public Issue(){}

    public Issue(int issueReportedId, String issueTitle){
        this.issueReportedId = issueReportedId;
        this.issueTitle = issueTitle;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getIssueReportedId() {
        return issueReportedId;
    }

    public void setIssueReportedId(int issueReportedId) {
        this.issueReportedId = issueReportedId;
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

    public String getIssuePriority() {
        return issuePriority;
    }

    public void setIssuePriority(String issuePriority) {
        this.issuePriority = issuePriority;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public void setIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
    }

    public Date getIssueCreationDate() {
        return issueCreationDate;
    }

    public void setIssueCreationDate(Date issueCreationDate) {
        this.issueCreationDate = issueCreationDate;
    }

    public Date getIssueTargetResolutionDate() {
        return issueTargetResolutionDate;
    }

    public void setIssueTargetResolutionDate(Date issueTargetResolutionDate) {
        this.issueTargetResolutionDate = issueTargetResolutionDate;
    }

    public Date getIssueActualResolutionDate() {
        return issueActualResolutionDate;
    }

    public void setIssueActualResolutionDate(Date issueActualResolutionDate) {
        this.issueActualResolutionDate = issueActualResolutionDate;
    }

    public Date getIssueModifiedDate() {
        return issueModifiedDate;
    }

    public void setIssueModifiedDate(Date issueModifiedDate) {
        this.issueModifiedDate = issueModifiedDate;
    }


}
