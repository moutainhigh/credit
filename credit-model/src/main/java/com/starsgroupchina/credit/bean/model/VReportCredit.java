package com.starsgroupchina.credit.bean.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.starsgroupchina.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel
public class VReportCredit extends BaseModel implements Serializable {
    @ApiModelProperty("个人信息-姓名")
    private String userName;

    @ApiModelProperty("个人信息-手机号码")
    private String userPhone;

    @ApiModelProperty("项目编号")
    private String projectNo;

    @ApiModelProperty("产品名称")
    private String prodectName;

    @ApiModelProperty("名称")
    private String categoryName;

    @ApiModelProperty("机构名称")
    private String orgName;

    @ApiModelProperty("来源（1、同盾、2、大峰、3、前海）")
    private Integer source;

    @ApiModelProperty("第三方产品类型（1、前海8036，2、前海8107，3、大蜂，4、同盾")
    private Integer thirdProductType;

    @ApiModelProperty("请求结果")
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_credit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProdectName() {
        return prodectName;
    }

    public void setProdectName(String prodectName) {
        this.prodectName = prodectName == null ? null : prodectName.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getThirdProductType() {
        return thirdProductType;
    }

    public void setThirdProductType(Integer thirdProductType) {
        this.thirdProductType = thirdProductType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_credit
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
        VReportCredit other = (VReportCredit) that;
        return (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getProjectNo() == null ? other.getProjectNo() == null : this.getProjectNo().equals(other.getProjectNo()))
            && (this.getProdectName() == null ? other.getProdectName() == null : this.getProdectName().equals(other.getProdectName()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getThirdProductType() == null ? other.getThirdProductType() == null : this.getThirdProductType().equals(other.getThirdProductType()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_credit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getProjectNo() == null) ? 0 : getProjectNo().hashCode());
        result = prime * result + ((getProdectName() == null) ? 0 : getProdectName().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getThirdProductType() == null) ? 0 : getThirdProductType().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        return result;
    }
}