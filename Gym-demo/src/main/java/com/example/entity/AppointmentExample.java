package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;
    protected  int PageSize;

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getStartRow() {
        return StartRow;
    }

    public void setStartRow(int startRow) {
        StartRow = startRow;
    }

    protected  int StartRow;
    protected List<Criteria> oredCriteria;

    public AppointmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
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

        public Criteria andAppointmentIdIsNull() {
            addCriterion("appointment_Id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNotNull() {
            addCriterion("appointment_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdEqualTo(Integer value) {
            addCriterion("appointment_Id =", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotEqualTo(Integer value) {
            addCriterion("appointment_Id <>", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThan(Integer value) {
            addCriterion("appointment_Id >", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointment_Id >=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThan(Integer value) {
            addCriterion("appointment_Id <", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("appointment_Id <=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIn(List<Integer> values) {
            addCriterion("appointment_Id in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotIn(List<Integer> values) {
            addCriterion("appointment_Id not in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdBetween(Integer value1, Integer value2) {
            addCriterion("appointment_Id between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appointment_Id not between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNull() {
            addCriterion("appointment_Date is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIsNotNull() {
            addCriterion("appointment_Date is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateEqualTo(String value) {
            addCriterion("appointment_Date =", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotEqualTo(String value) {
            addCriterion("appointment_Date <>", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThan(String value) {
            addCriterion("appointment_Date >", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_Date >=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThan(String value) {
            addCriterion("appointment_Date <", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLessThanOrEqualTo(String value) {
            addCriterion("appointment_Date <=", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateLike(String value) {
            addCriterion("appointment_Date like", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotLike(String value) {
            addCriterion("appointment_Date not like", value, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateIn(List<String> values) {
            addCriterion("appointment_Date in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotIn(List<String> values) {
            addCriterion("appointment_Date not in", values, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateBetween(String value1, String value2) {
            addCriterion("appointment_Date between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentDateNotBetween(String value1, String value2) {
            addCriterion("appointment_Date not between", value1, value2, "appointmentDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserIsNull() {
            addCriterion("appointment_User is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserIsNotNull() {
            addCriterion("appointment_User is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserEqualTo(String value) {
            addCriterion("appointment_User =", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserNotEqualTo(String value) {
            addCriterion("appointment_User <>", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserGreaterThan(String value) {
            addCriterion("appointment_User >", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_User >=", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserLessThan(String value) {
            addCriterion("appointment_User <", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserLessThanOrEqualTo(String value) {
            addCriterion("appointment_User <=", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserLike(String value) {
            addCriterion("appointment_User like", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserNotLike(String value) {
            addCriterion("appointment_User not like", value, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserIn(List<String> values) {
            addCriterion("appointment_User in", values, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserNotIn(List<String> values) {
            addCriterion("appointment_User not in", values, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserBetween(String value1, String value2) {
            addCriterion("appointment_User between", value1, value2, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentUserNotBetween(String value1, String value2) {
            addCriterion("appointment_User not between", value1, value2, "appointmentUser");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneIsNull() {
            addCriterion("appointment_phone is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneIsNotNull() {
            addCriterion("appointment_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneEqualTo(String value) {
            addCriterion("appointment_phone =", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneNotEqualTo(String value) {
            addCriterion("appointment_phone <>", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneGreaterThan(String value) {
            addCriterion("appointment_phone >", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_phone >=", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneLessThan(String value) {
            addCriterion("appointment_phone <", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneLessThanOrEqualTo(String value) {
            addCriterion("appointment_phone <=", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneLike(String value) {
            addCriterion("appointment_phone like", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneNotLike(String value) {
            addCriterion("appointment_phone not like", value, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneIn(List<String> values) {
            addCriterion("appointment_phone in", values, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneNotIn(List<String> values) {
            addCriterion("appointment_phone not in", values, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneBetween(String value1, String value2) {
            addCriterion("appointment_phone between", value1, value2, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentPhoneNotBetween(String value1, String value2) {
            addCriterion("appointment_phone not between", value1, value2, "appointmentPhone");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductIsNull() {
            addCriterion("appointMent_Product is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductIsNotNull() {
            addCriterion("appointMent_Product is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductEqualTo(String value) {
            addCriterion("appointMent_Product =", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductNotEqualTo(String value) {
            addCriterion("appointMent_Product <>", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductGreaterThan(String value) {
            addCriterion("appointMent_Product >", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductGreaterThanOrEqualTo(String value) {
            addCriterion("appointMent_Product >=", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductLessThan(String value) {
            addCriterion("appointMent_Product <", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductLessThanOrEqualTo(String value) {
            addCriterion("appointMent_Product <=", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductLike(String value) {
            addCriterion("appointMent_Product like", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductNotLike(String value) {
            addCriterion("appointMent_Product not like", value, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductIn(List<String> values) {
            addCriterion("appointMent_Product in", values, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductNotIn(List<String> values) {
            addCriterion("appointMent_Product not in", values, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductBetween(String value1, String value2) {
            addCriterion("appointMent_Product between", value1, value2, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentProductNotBetween(String value1, String value2) {
            addCriterion("appointMent_Product not between", value1, value2, "appointmentProduct");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointMent_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointMent_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(String value) {
            addCriterion("appointMent_time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(String value) {
            addCriterion("appointMent_time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(String value) {
            addCriterion("appointMent_time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appointMent_time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(String value) {
            addCriterion("appointMent_time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(String value) {
            addCriterion("appointMent_time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLike(String value) {
            addCriterion("appointMent_time like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotLike(String value) {
            addCriterion("appointMent_time not like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<String> values) {
            addCriterion("appointMent_time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<String> values) {
            addCriterion("appointMent_time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(String value1, String value2) {
            addCriterion("appointMent_time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(String value1, String value2) {
            addCriterion("appointMent_time not between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andConductorIsNull() {
            addCriterion("conductor is null");
            return (Criteria) this;
        }

        public Criteria andConductorIsNotNull() {
            addCriterion("conductor is not null");
            return (Criteria) this;
        }

        public Criteria andConductorEqualTo(String value) {
            addCriterion("conductor =", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorNotEqualTo(String value) {
            addCriterion("conductor <>", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorGreaterThan(String value) {
            addCriterion("conductor >", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorGreaterThanOrEqualTo(String value) {
            addCriterion("conductor >=", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorLessThan(String value) {
            addCriterion("conductor <", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorLessThanOrEqualTo(String value) {
            addCriterion("conductor <=", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorLike(String value) {
            addCriterion("conductor like", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorNotLike(String value) {
            addCriterion("conductor not like", value, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorIn(List<String> values) {
            addCriterion("conductor in", values, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorNotIn(List<String> values) {
            addCriterion("conductor not in", values, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorBetween(String value1, String value2) {
            addCriterion("conductor between", value1, value2, "conductor");
            return (Criteria) this;
        }

        public Criteria andConductorNotBetween(String value1, String value2) {
            addCriterion("conductor not between", value1, value2, "conductor");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleIsNull() {
            addCriterion("appointment_Style is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleIsNotNull() {
            addCriterion("appointment_Style is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleEqualTo(String value) {
            addCriterion("appointment_Style =", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleNotEqualTo(String value) {
            addCriterion("appointment_Style <>", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleGreaterThan(String value) {
            addCriterion("appointment_Style >", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_Style >=", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleLessThan(String value) {
            addCriterion("appointment_Style <", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleLessThanOrEqualTo(String value) {
            addCriterion("appointment_Style <=", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleLike(String value) {
            addCriterion("appointment_Style like", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleNotLike(String value) {
            addCriterion("appointment_Style not like", value, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleIn(List<String> values) {
            addCriterion("appointment_Style in", values, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleNotIn(List<String> values) {
            addCriterion("appointment_Style not in", values, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleBetween(String value1, String value2) {
            addCriterion("appointment_Style between", value1, value2, "appointmentStyle");
            return (Criteria) this;
        }

        public Criteria andAppointmentStyleNotBetween(String value1, String value2) {
            addCriterion("appointment_Style not between", value1, value2, "appointmentStyle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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