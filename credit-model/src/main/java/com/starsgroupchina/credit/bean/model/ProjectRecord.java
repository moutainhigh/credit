package com.starsgroupchina.credit.bean.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.starsgroupchina.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

@ApiModel
public class ProjectRecord extends BaseModel implements Serializable {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("项目编号")
    private String projectNo;

    @ApiModelProperty("审核节点")
    private String auditNode;

    @ApiModelProperty("审核人ID")
    private Integer auditMemberId;

    @ApiModelProperty("审核时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date auditDate;

    @ApiModelProperty("审核结果")
    private String auditResult;

    @ApiModelProperty("审核备注")
    private String auditRemark;

    @ApiModelProperty("审批贷款额度")
    private Double approveAmount;

    @ApiModelProperty("审批贷款期限")
    private Double approveLoanDuration;

    @ApiModelProperty("审批贷款期限（单位）")
    private String approveLoanUnit;

    @ApiModelProperty("审批贷款期限（天）")
    private Integer approveLoanDurationDay;

    @ApiModelProperty("0,正常，-1删除")
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table project_record
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getAuditNode() {
        return auditNode;
    }

    public void setAuditNode(String auditNode) {
        this.auditNode = auditNode == null ? null : auditNode.trim();
    }

    public Integer getAuditMemberId() {
        return auditMemberId;
    }

    public void setAuditMemberId(Integer auditMemberId) {
        this.auditMemberId = auditMemberId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    public Double getApproveAmount() {
        return approveAmount;
    }

    public void setApproveAmount(Double approveAmount) {
        this.approveAmount = approveAmount;
    }

    public Double getApproveLoanDuration() {
        return approveLoanDuration;
    }

    public void setApproveLoanDuration(Double approveLoanDuration) {
        this.approveLoanDuration = approveLoanDuration;
    }

    public String getApproveLoanUnit() {
        return approveLoanUnit;
    }

    public void setApproveLoanUnit(String approveLoanUnit) {
        this.approveLoanUnit = approveLoanUnit == null ? null : approveLoanUnit.trim();
    }

    public Integer getApproveLoanDurationDay() {
        return approveLoanDurationDay;
    }

    public void setApproveLoanDurationDay(Integer approveLoanDurationDay) {
        this.approveLoanDurationDay = approveLoanDurationDay;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_record
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        ProjectRecord other = (ProjectRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectNo() == null ? other.getProjectNo() == null : this.getProjectNo().equals(other.getProjectNo()))
            && (this.getAuditNode() == null ? other.getAuditNode() == null : this.getAuditNode().equals(other.getAuditNode()))
            && (this.getAuditMemberId() == null ? other.getAuditMemberId() == null : this.getAuditMemberId().equals(other.getAuditMemberId()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditResult() == null ? other.getAuditResult() == null : this.getAuditResult().equals(other.getAuditResult()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getApproveAmount() == null ? other.getApproveAmount() == null : this.getApproveAmount().equals(other.getApproveAmount()))
            && (this.getApproveLoanDuration() == null ? other.getApproveLoanDuration() == null : this.getApproveLoanDuration().equals(other.getApproveLoanDuration()))
            && (this.getApproveLoanUnit() == null ? other.getApproveLoanUnit() == null : this.getApproveLoanUnit().equals(other.getApproveLoanUnit()))
            && (this.getApproveLoanDurationDay() == null ? other.getApproveLoanDurationDay() == null : this.getApproveLoanDurationDay().equals(other.getApproveLoanDurationDay()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getModifyUserId() == null ? other.getModifyUserId() == null : this.getModifyUserId().equals(other.getModifyUserId()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getModifyUser() == null ? other.getModifyUser() == null : this.getModifyUser().equals(other.getModifyUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_record
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectNo() == null) ? 0 : getProjectNo().hashCode());
        result = prime * result + ((getAuditNode() == null) ? 0 : getAuditNode().hashCode());
        result = prime * result + ((getAuditMemberId() == null) ? 0 : getAuditMemberId().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditResult() == null) ? 0 : getAuditResult().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getApproveAmount() == null) ? 0 : getApproveAmount().hashCode());
        result = prime * result + ((getApproveLoanDuration() == null) ? 0 : getApproveLoanDuration().hashCode());
        result = prime * result + ((getApproveLoanUnit() == null) ? 0 : getApproveLoanUnit().hashCode());
        result = prime * result + ((getApproveLoanDurationDay() == null) ? 0 : getApproveLoanDurationDay().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getModifyUserId() == null) ? 0 : getModifyUserId().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getModifyUser() == null) ? 0 : getModifyUser().hashCode());
        return result;
    }
}