package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;
    protected  int PageSize;
    protected  int StartRow;
    protected List<Criteria> oredCriteria;

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

    public MemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_Id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_Id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_Id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_Id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_Id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_Id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_Id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_Id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_Id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_Id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_Id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
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

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_Type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_Type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("member_Type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("member_Type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("member_Type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("member_Type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("member_Type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("member_Type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("member_Type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("member_Type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("member_Type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("member_Type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("member_Type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("member_Type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIsNull() {
            addCriterion("member_telephone is null");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIsNotNull() {
            addCriterion("member_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneEqualTo(String value) {
            addCriterion("member_telephone =", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotEqualTo(String value) {
            addCriterion("member_telephone <>", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneGreaterThan(String value) {
            addCriterion("member_telephone >", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_telephone >=", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLessThan(String value) {
            addCriterion("member_telephone <", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLessThanOrEqualTo(String value) {
            addCriterion("member_telephone <=", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLike(String value) {
            addCriterion("member_telephone like", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotLike(String value) {
            addCriterion("member_telephone not like", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIn(List<String> values) {
            addCriterion("member_telephone in", values, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotIn(List<String> values) {
            addCriterion("member_telephone not in", values, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneBetween(String value1, String value2) {
            addCriterion("member_telephone between", value1, value2, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotBetween(String value1, String value2) {
            addCriterion("member_telephone not between", value1, value2, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorIsNull() {
            addCriterion("member_counselor is null");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorIsNotNull() {
            addCriterion("member_counselor is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorEqualTo(String value) {
            addCriterion("member_counselor =", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorNotEqualTo(String value) {
            addCriterion("member_counselor <>", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorGreaterThan(String value) {
            addCriterion("member_counselor >", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorGreaterThanOrEqualTo(String value) {
            addCriterion("member_counselor >=", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorLessThan(String value) {
            addCriterion("member_counselor <", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorLessThanOrEqualTo(String value) {
            addCriterion("member_counselor <=", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorLike(String value) {
            addCriterion("member_counselor like", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorNotLike(String value) {
            addCriterion("member_counselor not like", value, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorIn(List<String> values) {
            addCriterion("member_counselor in", values, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorNotIn(List<String> values) {
            addCriterion("member_counselor not in", values, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorBetween(String value1, String value2) {
            addCriterion("member_counselor between", value1, value2, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andMemberCounselorNotBetween(String value1, String value2) {
            addCriterion("member_counselor not between", value1, value2, "memberCounselor");
            return (Criteria) this;
        }

        public Criteria andCardBalanceIsNull() {
            addCriterion("card_balance is null");
            return (Criteria) this;
        }

        public Criteria andCardBalanceIsNotNull() {
            addCriterion("card_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCardBalanceEqualTo(Double value) {
            addCriterion("card_balance =", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotEqualTo(Double value) {
            addCriterion("card_balance <>", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceGreaterThan(Double value) {
            addCriterion("card_balance >", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("card_balance >=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceLessThan(Double value) {
            addCriterion("card_balance <", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceLessThanOrEqualTo(Double value) {
            addCriterion("card_balance <=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceIn(List<Double> values) {
            addCriterion("card_balance in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotIn(List<Double> values) {
            addCriterion("card_balance not in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceBetween(Double value1, Double value2) {
            addCriterion("card_balance between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotBetween(Double value1, Double value2) {
            addCriterion("card_balance not between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("credit not between", value1, value2, "credit");
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