package com.starsgroupchina.credit.bean.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.starsgroupchina.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel
public class ProjectRelationBlacklist extends BaseModel implements Serializable {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("项目id")
    private Integer projectId;

    @ApiModelProperty("项目编号")
    private String projectNo;

    @ApiModelProperty("黑名单id")
    private Integer blacklistId;

    @ApiModelProperty("是否异常(0、正常，1、异常)")
    private Short isOk;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("0,正常，1禁用，-1删除")
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table project_relation_blacklist
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

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Integer getBlacklistId() {
        return blacklistId;
    }

    public void setBlacklistId(Integer blacklistId) {
        this.blacklistId = blacklistId;
    }

    public Short getIsOk() {
        return isOk;
    }

    public void setIsOk(Short isOk) {
        this.isOk = isOk;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_relation_blacklist
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
        ProjectRelationBlacklist other = (ProjectRelationBlacklist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectNo() == null ? other.getProjectNo() == null : this.getProjectNo().equals(other.getProjectNo()))
            && (this.getBlacklistId() == null ? other.getBlacklistId() == null : this.getBlacklistId().equals(other.getBlacklistId()))
            && (this.getIsOk() == null ? other.getIsOk() == null : this.getIsOk().equals(other.getIsOk()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getModifyUser() == null ? other.getModifyUser() == null : this.getModifyUser().equals(other.getModifyUser()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getModifyUserId() == null ? other.getModifyUserId() == null : this.getModifyUserId().equals(other.getModifyUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_relation_blacklist
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectNo() == null) ? 0 : getProjectNo().hashCode());
        result = prime * result + ((getBlacklistId() == null) ? 0 : getBlacklistId().hashCode());
        result = prime * result + ((getIsOk() == null) ? 0 : getIsOk().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getModifyUser() == null) ? 0 : getModifyUser().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getModifyUserId() == null) ? 0 : getModifyUserId().hashCode());
        return result;
    }
}