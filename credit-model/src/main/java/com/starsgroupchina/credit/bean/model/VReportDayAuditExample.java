package com.starsgroupchina.credit.bean.model;

import com.starsgroupchina.common.base.BaseExample;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VReportDayAuditExample extends BaseExample implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    protected List<Criteria> oredCriteria;

    private String additionalWhere;

    private Integer limit;

    private Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public VReportDayAuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setAdditionalWhere(String additionalWhere) {
        this.additionalWhere = additionalWhere;
    }

    public String getAdditionalWhere() {
        return additionalWhere;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNull() {
            addCriterion("entry_num is null");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNotNull() {
            addCriterion("entry_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNumEqualTo(Long value) {
            addCriterion("entry_num =", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotEqualTo(Long value) {
            addCriterion("entry_num <>", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThan(Long value) {
            addCriterion("entry_num >", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThanOrEqualTo(Long value) {
            addCriterion("entry_num >=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThan(Long value) {
            addCriterion("entry_num <", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThanOrEqualTo(Long value) {
            addCriterion("entry_num <=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIn(List<Long> values) {
            addCriterion("entry_num in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotIn(List<Long> values) {
            addCriterion("entry_num not in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumBetween(Long value1, Long value2) {
            addCriterion("entry_num between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotBetween(Long value1, Long value2) {
            addCriterion("entry_num not between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumIsNull() {
            addCriterion("audit_handle_num is null");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumIsNotNull() {
            addCriterion("audit_handle_num is not null");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumEqualTo(Long value) {
            addCriterion("audit_handle_num =", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumNotEqualTo(Long value) {
            addCriterion("audit_handle_num <>", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumGreaterThan(Long value) {
            addCriterion("audit_handle_num >", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_handle_num >=", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumLessThan(Long value) {
            addCriterion("audit_handle_num <", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumLessThanOrEqualTo(Long value) {
            addCriterion("audit_handle_num <=", value, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumIn(List<Long> values) {
            addCriterion("audit_handle_num in", values, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumNotIn(List<Long> values) {
            addCriterion("audit_handle_num not in", values, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumBetween(Long value1, Long value2) {
            addCriterion("audit_handle_num between", value1, value2, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditHandleNumNotBetween(Long value1, Long value2) {
            addCriterion("audit_handle_num not between", value1, value2, "auditHandleNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumIsNull() {
            addCriterion("audit_attendance_num is null");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumIsNotNull() {
            addCriterion("audit_attendance_num is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumEqualTo(Long value) {
            addCriterion("audit_attendance_num =", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumNotEqualTo(Long value) {
            addCriterion("audit_attendance_num <>", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumGreaterThan(Long value) {
            addCriterion("audit_attendance_num >", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_attendance_num >=", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumLessThan(Long value) {
            addCriterion("audit_attendance_num <", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumLessThanOrEqualTo(Long value) {
            addCriterion("audit_attendance_num <=", value, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumIn(List<Long> values) {
            addCriterion("audit_attendance_num in", values, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumNotIn(List<Long> values) {
            addCriterion("audit_attendance_num not in", values, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumBetween(Long value1, Long value2) {
            addCriterion("audit_attendance_num between", value1, value2, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAttendanceNumNotBetween(Long value1, Long value2) {
            addCriterion("audit_attendance_num not between", value1, value2, "auditAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumIsNull() {
            addCriterion("audit_average_num is null");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumIsNotNull() {
            addCriterion("audit_average_num is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumEqualTo(BigDecimal value) {
            addCriterion("audit_average_num =", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumNotEqualTo(BigDecimal value) {
            addCriterion("audit_average_num <>", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumGreaterThan(BigDecimal value) {
            addCriterion("audit_average_num >", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("audit_average_num >=", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumLessThan(BigDecimal value) {
            addCriterion("audit_average_num <", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("audit_average_num <=", value, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumIn(List<BigDecimal> values) {
            addCriterion("audit_average_num in", values, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumNotIn(List<BigDecimal> values) {
            addCriterion("audit_average_num not in", values, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("audit_average_num between", value1, value2, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditAverageNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("audit_average_num not between", value1, value2, "auditAverageNum");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateIsNull() {
            addCriterion("audit_treatment_rate is null");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateIsNotNull() {
            addCriterion("audit_treatment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateEqualTo(BigDecimal value) {
            addCriterion("audit_treatment_rate =", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateNotEqualTo(BigDecimal value) {
            addCriterion("audit_treatment_rate <>", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateGreaterThan(BigDecimal value) {
            addCriterion("audit_treatment_rate >", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("audit_treatment_rate >=", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateLessThan(BigDecimal value) {
            addCriterion("audit_treatment_rate <", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("audit_treatment_rate <=", value, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateIn(List<BigDecimal> values) {
            addCriterion("audit_treatment_rate in", values, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateNotIn(List<BigDecimal> values) {
            addCriterion("audit_treatment_rate not in", values, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("audit_treatment_rate between", value1, value2, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andAuditTreatmentRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("audit_treatment_rate not between", value1, value2, "auditTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumIsNull() {
            addCriterion("recheck_handle_num is null");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumIsNotNull() {
            addCriterion("recheck_handle_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumEqualTo(Long value) {
            addCriterion("recheck_handle_num =", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumNotEqualTo(Long value) {
            addCriterion("recheck_handle_num <>", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumGreaterThan(Long value) {
            addCriterion("recheck_handle_num >", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("recheck_handle_num >=", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumLessThan(Long value) {
            addCriterion("recheck_handle_num <", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumLessThanOrEqualTo(Long value) {
            addCriterion("recheck_handle_num <=", value, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumIn(List<Long> values) {
            addCriterion("recheck_handle_num in", values, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumNotIn(List<Long> values) {
            addCriterion("recheck_handle_num not in", values, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumBetween(Long value1, Long value2) {
            addCriterion("recheck_handle_num between", value1, value2, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckHandleNumNotBetween(Long value1, Long value2) {
            addCriterion("recheck_handle_num not between", value1, value2, "recheckHandleNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumIsNull() {
            addCriterion("recheck_attendance_num is null");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumIsNotNull() {
            addCriterion("recheck_attendance_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumEqualTo(Long value) {
            addCriterion("recheck_attendance_num =", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumNotEqualTo(Long value) {
            addCriterion("recheck_attendance_num <>", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumGreaterThan(Long value) {
            addCriterion("recheck_attendance_num >", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumGreaterThanOrEqualTo(Long value) {
            addCriterion("recheck_attendance_num >=", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumLessThan(Long value) {
            addCriterion("recheck_attendance_num <", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumLessThanOrEqualTo(Long value) {
            addCriterion("recheck_attendance_num <=", value, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumIn(List<Long> values) {
            addCriterion("recheck_attendance_num in", values, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumNotIn(List<Long> values) {
            addCriterion("recheck_attendance_num not in", values, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumBetween(Long value1, Long value2) {
            addCriterion("recheck_attendance_num between", value1, value2, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAttendanceNumNotBetween(Long value1, Long value2) {
            addCriterion("recheck_attendance_num not between", value1, value2, "recheckAttendanceNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumIsNull() {
            addCriterion("recheck_average_num is null");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumIsNotNull() {
            addCriterion("recheck_average_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumEqualTo(BigDecimal value) {
            addCriterion("recheck_average_num =", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumNotEqualTo(BigDecimal value) {
            addCriterion("recheck_average_num <>", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumGreaterThan(BigDecimal value) {
            addCriterion("recheck_average_num >", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recheck_average_num >=", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumLessThan(BigDecimal value) {
            addCriterion("recheck_average_num <", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recheck_average_num <=", value, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumIn(List<BigDecimal> values) {
            addCriterion("recheck_average_num in", values, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumNotIn(List<BigDecimal> values) {
            addCriterion("recheck_average_num not in", values, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recheck_average_num between", value1, value2, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckAverageNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recheck_average_num not between", value1, value2, "recheckAverageNum");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateIsNull() {
            addCriterion("recheck_treatment_rate is null");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateIsNotNull() {
            addCriterion("recheck_treatment_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateEqualTo(BigDecimal value) {
            addCriterion("recheck_treatment_rate =", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateNotEqualTo(BigDecimal value) {
            addCriterion("recheck_treatment_rate <>", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateGreaterThan(BigDecimal value) {
            addCriterion("recheck_treatment_rate >", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recheck_treatment_rate >=", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateLessThan(BigDecimal value) {
            addCriterion("recheck_treatment_rate <", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recheck_treatment_rate <=", value, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateIn(List<BigDecimal> values) {
            addCriterion("recheck_treatment_rate in", values, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateNotIn(List<BigDecimal> values) {
            addCriterion("recheck_treatment_rate not in", values, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recheck_treatment_rate between", value1, value2, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andRecheckTreatmentRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recheck_treatment_rate not between", value1, value2, "recheckTreatmentRate");
            return (Criteria) this;
        }

        public Criteria andPendingIsNull() {
            addCriterion("pending is null");
            return (Criteria) this;
        }

        public Criteria andPendingIsNotNull() {
            addCriterion("pending is not null");
            return (Criteria) this;
        }

        public Criteria andPendingEqualTo(Long value) {
            addCriterion("pending =", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotEqualTo(Long value) {
            addCriterion("pending <>", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingGreaterThan(Long value) {
            addCriterion("pending >", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingGreaterThanOrEqualTo(Long value) {
            addCriterion("pending >=", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingLessThan(Long value) {
            addCriterion("pending <", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingLessThanOrEqualTo(Long value) {
            addCriterion("pending <=", value, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingIn(List<Long> values) {
            addCriterion("pending in", values, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotIn(List<Long> values) {
            addCriterion("pending not in", values, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingBetween(Long value1, Long value2) {
            addCriterion("pending between", value1, value2, "pending");
            return (Criteria) this;
        }

        public Criteria andPendingNotBetween(Long value1, Long value2) {
            addCriterion("pending not between", value1, value2, "pending");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table v_report_day_audit
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 19 16:26:10 CST 2018
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table v_report_day_audit
     *
     * @mbg.generated Wed Dec 19 16:26:10 CST 2018
     */
    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}