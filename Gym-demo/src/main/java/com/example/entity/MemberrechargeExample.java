package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberrechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    protected  int PageSize;
    protected  int StartRow;

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

    public MemberrechargeExample() {
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

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNull() {
            addCriterion("recharge_Date is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNotNull() {
            addCriterion("recharge_Date is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateEqualTo(String value) {
            addCriterion("recharge_Date =", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotEqualTo(String value) {
            addCriterion("recharge_Date <>", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThan(String value) {
            addCriterion("recharge_Date >", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_Date >=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThan(String value) {
            addCriterion("recharge_Date <", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThanOrEqualTo(String value) {
            addCriterion("recharge_Date <=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLike(String value) {
            addCriterion("recharge_Date like", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotLike(String value) {
            addCriterion("recharge_Date not like", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIn(List<String> values) {
            addCriterion("recharge_Date in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotIn(List<String> values) {
            addCriterion("recharge_Date not in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateBetween(String value1, String value2) {
            addCriterion("recharge_Date between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotBetween(String value1, String value2) {
            addCriterion("recharge_Date not between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardIsNull() {
            addCriterion("member_Idcard is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardIsNotNull() {
            addCriterion("member_Idcard is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardEqualTo(Integer value) {
            addCriterion("member_Idcard =", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardNotEqualTo(Integer value) {
            addCriterion("member_Idcard <>", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardGreaterThan(Integer value) {
            addCriterion("member_Idcard >", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_Idcard >=", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardLessThan(Integer value) {
            addCriterion("member_Idcard <", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardLessThanOrEqualTo(Integer value) {
            addCriterion("member_Idcard <=", value, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardIn(List<Integer> values) {
            addCriterion("member_Idcard in", values, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardNotIn(List<Integer> values) {
            addCriterion("member_Idcard not in", values, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardBetween(Integer value1, Integer value2) {
            addCriterion("member_Idcard between", value1, value2, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberIdcardNotBetween(Integer value1, Integer value2) {
            addCriterion("member_Idcard not between", value1, value2, "memberIdcard");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_Name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_Name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_Name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_Name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_Name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_Name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_Name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_Name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_Name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_Name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_Name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_Name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_Name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameIsNull() {
            addCriterion("member_TypeName is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameIsNotNull() {
            addCriterion("member_TypeName is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameEqualTo(String value) {
            addCriterion("member_TypeName =", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameNotEqualTo(String value) {
            addCriterion("member_TypeName <>", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameGreaterThan(String value) {
            addCriterion("member_TypeName >", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("member_TypeName >=", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameLessThan(String value) {
            addCriterion("member_TypeName <", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameLessThanOrEqualTo(String value) {
            addCriterion("member_TypeName <=", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameLike(String value) {
            addCriterion("member_TypeName like", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameNotLike(String value) {
            addCriterion("member_TypeName not like", value, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameIn(List<String> values) {
            addCriterion("member_TypeName in", values, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameNotIn(List<String> values) {
            addCriterion("member_TypeName not in", values, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameBetween(String value1, String value2) {
            addCriterion("member_TypeName between", value1, value2, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andMemberTypenameNotBetween(String value1, String value2) {
            addCriterion("member_TypeName not between", value1, value2, "memberTypename");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(String value) {
            addCriterion("recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(String value) {
            addCriterion("recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(String value) {
            addCriterion("recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(String value) {
            addCriterion("recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(String value) {
            addCriterion("recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLike(String value) {
            addCriterion("recharge_type like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotLike(String value) {
            addCriterion("recharge_type not like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<String> values) {
            addCriterion("recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<String> values) {
            addCriterion("recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(String value1, String value2) {
            addCriterion("recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(String value1, String value2) {
            addCriterion("recharge_type not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRealrechargeIsNull() {
            addCriterion("realrecharge is null");
            return (Criteria) this;
        }

        public Criteria andRealrechargeIsNotNull() {
            addCriterion("realrecharge is not null");
            return (Criteria) this;
        }

        public Criteria andRealrechargeEqualTo(Integer value) {
            addCriterion("realrecharge =", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeNotEqualTo(Integer value) {
            addCriterion("realrecharge <>", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeGreaterThan(Integer value) {
            addCriterion("realrecharge >", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("realrecharge >=", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeLessThan(Integer value) {
            addCriterion("realrecharge <", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeLessThanOrEqualTo(Integer value) {
            addCriterion("realrecharge <=", value, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeIn(List<Integer> values) {
            addCriterion("realrecharge in", values, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeNotIn(List<Integer> values) {
            addCriterion("realrecharge not in", values, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeBetween(Integer value1, Integer value2) {
            addCriterion("realrecharge between", value1, value2, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andRealrechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("realrecharge not between", value1, value2, "realrecharge");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceIsNull() {
            addCriterion("current_blance is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceIsNotNull() {
            addCriterion("current_blance is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceEqualTo(Integer value) {
            addCriterion("current_blance =", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceNotEqualTo(Integer value) {
            addCriterion("current_blance <>", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceGreaterThan(Integer value) {
            addCriterion("current_blance >", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_blance >=", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceLessThan(Integer value) {
            addCriterion("current_blance <", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceLessThanOrEqualTo(Integer value) {
            addCriterion("current_blance <=", value, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceIn(List<Integer> values) {
            addCriterion("current_blance in", values, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceNotIn(List<Integer> values) {
            addCriterion("current_blance not in", values, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceBetween(Integer value1, Integer value2) {
            addCriterion("current_blance between", value1, value2, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andCurrentBlanceNotBetween(Integer value1, Integer value2) {
            addCriterion("current_blance not between", value1, value2, "currentBlance");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andEmployeesIsNull() {
            addCriterion("employees is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesIsNotNull() {
            addCriterion("employees is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesEqualTo(String value) {
            addCriterion("employees =", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotEqualTo(String value) {
            addCriterion("employees <>", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesGreaterThan(String value) {
            addCriterion("employees >", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesGreaterThanOrEqualTo(String value) {
            addCriterion("employees >=", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLessThan(String value) {
            addCriterion("employees <", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLessThanOrEqualTo(String value) {
            addCriterion("employees <=", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLike(String value) {
            addCriterion("employees like", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotLike(String value) {
            addCriterion("employees not like", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesIn(List<String> values) {
            addCriterion("employees in", values, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotIn(List<String> values) {
            addCriterion("employees not in", values, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesBetween(String value1, String value2) {
            addCriterion("employees between", value1, value2, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotBetween(String value1, String value2) {
            addCriterion("employees not between", value1, value2, "employees");
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