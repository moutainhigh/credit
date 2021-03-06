package com.starsgroupchina.credit.bean.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.starsgroupchina.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel
public class VReportDayAudit extends BaseModel implements Serializable {
    @ApiModelProperty("")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date date;

    @ApiModelProperty("")
    private Long entryNum;

    @ApiModelProperty("")
    private Long auditHandleNum;

    @ApiModelProperty("")
    private Long auditAttendanceNum;

    @ApiModelProperty("")
    private BigDecimal auditAverageNum;

    @ApiModelProperty("")
    private BigDecimal auditTreatmentRate;

    @ApiModelProperty("")
    private Long recheckHandleNum;

    @ApiModelProperty("")
    private Long recheckAttendanceNum;

    @ApiModelProperty("")
    private BigDecimal recheckAverageNum;

    @ApiModelProperty("")
    private BigDecimal recheckTreatmentRate;

    @ApiModelProperty("")
    private Long pending;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    private static final long serialVersionUID = 1L;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Long entryNum) {
        this.entryNum = entryNum;
    }

    public Long getAuditHandleNum() {
        return auditHandleNum;
    }

    public void setAuditHandleNum(Long auditHandleNum) {
        this.auditHandleNum = auditHandleNum;
    }

    public Long getAuditAttendanceNum() {
        return auditAttendanceNum;
    }

    public void setAuditAttendanceNum(Long auditAttendanceNum) {
        this.auditAttendanceNum = auditAttendanceNum;
    }

    public BigDecimal getAuditAverageNum() {
        return auditAverageNum;
    }

    public void setAuditAverageNum(BigDecimal auditAverageNum) {
        this.auditAverageNum = auditAverageNum;
    }

    public BigDecimal getAuditTreatmentRate() {
        return auditTreatmentRate;
    }

    public void setAuditTreatmentRate(BigDecimal auditTreatmentRate) {
        this.auditTreatmentRate = auditTreatmentRate;
    }

    public Long getRecheckHandleNum() {
        return recheckHandleNum;
    }

    public void setRecheckHandleNum(Long recheckHandleNum) {
        this.recheckHandleNum = recheckHandleNum;
    }

    public Long getRecheckAttendanceNum() {
        return recheckAttendanceNum;
    }

    public void setRecheckAttendanceNum(Long recheckAttendanceNum) {
        this.recheckAttendanceNum = recheckAttendanceNum;
    }

    public BigDecimal getRecheckAverageNum() {
        return recheckAverageNum;
    }

    public void setRecheckAverageNum(BigDecimal recheckAverageNum) {
        this.recheckAverageNum = recheckAverageNum;
    }

    public BigDecimal getRecheckTreatmentRate() {
        return recheckTreatmentRate;
    }

    public void setRecheckTreatmentRate(BigDecimal recheckTreatmentRate) {
        this.recheckTreatmentRate = recheckTreatmentRate;
    }

    public Long getPending() {
        return pending;
    }

    public void setPending(Long pending) {
        this.pending = pending;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
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
        VReportDayAudit other = (VReportDayAudit) that;
        return (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getEntryNum() == null ? other.getEntryNum() == null : this.getEntryNum().equals(other.getEntryNum()))
            && (this.getAuditHandleNum() == null ? other.getAuditHandleNum() == null : this.getAuditHandleNum().equals(other.getAuditHandleNum()))
            && (this.getAuditAttendanceNum() == null ? other.getAuditAttendanceNum() == null : this.getAuditAttendanceNum().equals(other.getAuditAttendanceNum()))
            && (this.getAuditAverageNum() == null ? other.getAuditAverageNum() == null : this.getAuditAverageNum().equals(other.getAuditAverageNum()))
            && (this.getAuditTreatmentRate() == null ? other.getAuditTreatmentRate() == null : this.getAuditTreatmentRate().equals(other.getAuditTreatmentRate()))
            && (this.getRecheckHandleNum() == null ? other.getRecheckHandleNum() == null : this.getRecheckHandleNum().equals(other.getRecheckHandleNum()))
            && (this.getRecheckAttendanceNum() == null ? other.getRecheckAttendanceNum() == null : this.getRecheckAttendanceNum().equals(other.getRecheckAttendanceNum()))
            && (this.getRecheckAverageNum() == null ? other.getRecheckAverageNum() == null : this.getRecheckAverageNum().equals(other.getRecheckAverageNum()))
            && (this.getRecheckTreatmentRate() == null ? other.getRecheckTreatmentRate() == null : this.getRecheckTreatmentRate().equals(other.getRecheckTreatmentRate()))
            && (this.getPending() == null ? other.getPending() == null : this.getPending().equals(other.getPending()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getEntryNum() == null) ? 0 : getEntryNum().hashCode());
        result = prime * result + ((getAuditHandleNum() == null) ? 0 : getAuditHandleNum().hashCode());
        result = prime * result + ((getAuditAttendanceNum() == null) ? 0 : getAuditAttendanceNum().hashCode());
        result = prime * result + ((getAuditAverageNum() == null) ? 0 : getAuditAverageNum().hashCode());
        result = prime * result + ((getAuditTreatmentRate() == null) ? 0 : getAuditTreatmentRate().hashCode());
        result = prime * result + ((getRecheckHandleNum() == null) ? 0 : getRecheckHandleNum().hashCode());
        result = prime * result + ((getRecheckAttendanceNum() == null) ? 0 : getRecheckAttendanceNum().hashCode());
        result = prime * result + ((getRecheckAverageNum() == null) ? 0 : getRecheckAverageNum().hashCode());
        result = prime * result + ((getRecheckTreatmentRate() == null) ? 0 : getRecheckTreatmentRate().hashCode());
        result = prime * result + ((getPending() == null) ? 0 : getPending().hashCode());
        return result;
    }
}