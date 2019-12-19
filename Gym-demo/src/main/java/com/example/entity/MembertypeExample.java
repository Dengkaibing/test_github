package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MembertypeExample {
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

    public MembertypeExample() {
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

        public Criteria andTypeNameIsNull() {
            addCriterion("Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("Type_Name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("Type_Name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("Type_Name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Type_Name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("Type_Name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Type_Name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("Type_Name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("Type_Name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("Type_Name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("Type_Name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("Type_Name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("Type_Name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIsNull() {
            addCriterion("product_Discount is null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIsNotNull() {
            addCriterion("product_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andProductDiscountEqualTo(Double value) {
            addCriterion("product_Discount =", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotEqualTo(Double value) {
            addCriterion("product_Discount <>", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountGreaterThan(Double value) {
            addCriterion("product_Discount >", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("product_Discount >=", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountLessThan(Double value) {
            addCriterion("product_Discount <", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountLessThanOrEqualTo(Double value) {
            addCriterion("product_Discount <=", value, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountIn(List<Double> values) {
            addCriterion("product_Discount in", values, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotIn(List<Double> values) {
            addCriterion("product_Discount not in", values, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountBetween(Double value1, Double value2) {
            addCriterion("product_Discount between", value1, value2, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andProductDiscountNotBetween(Double value1, Double value2) {
            addCriterion("product_Discount not between", value1, value2, "productDiscount");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_Money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_Money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(Integer value) {
            addCriterion("recharge_Money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(Integer value) {
            addCriterion("recharge_Money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(Integer value) {
            addCriterion("recharge_Money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_Money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(Integer value) {
            addCriterion("recharge_Money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_Money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<Integer> values) {
            addCriterion("recharge_Money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<Integer> values) {
            addCriterion("recharge_Money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("recharge_Money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_Money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyIsNull() {
            addCriterion("given_Money is null");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyIsNotNull() {
            addCriterion("given_Money is not null");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyEqualTo(Integer value) {
            addCriterion("given_Money =", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyNotEqualTo(Integer value) {
            addCriterion("given_Money <>", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyGreaterThan(Integer value) {
            addCriterion("given_Money >", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("given_Money >=", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyLessThan(Integer value) {
            addCriterion("given_Money <", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("given_Money <=", value, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyIn(List<Integer> values) {
            addCriterion("given_Money in", values, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyNotIn(List<Integer> values) {
            addCriterion("given_Money not in", values, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyBetween(Integer value1, Integer value2) {
            addCriterion("given_Money between", value1, value2, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andGivenMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("given_Money not between", value1, value2, "givenMoney");
            return (Criteria) this;
        }

        public Criteria andPotLifeIsNull() {
            addCriterion("pot_Life is null");
            return (Criteria) this;
        }

        public Criteria andPotLifeIsNotNull() {
            addCriterion("pot_Life is not null");
            return (Criteria) this;
        }

        public Criteria andPotLifeEqualTo(String value) {
            addCriterion("pot_Life =", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeNotEqualTo(String value) {
            addCriterion("pot_Life <>", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeGreaterThan(String value) {
            addCriterion("pot_Life >", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeGreaterThanOrEqualTo(String value) {
            addCriterion("pot_Life >=", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeLessThan(String value) {
            addCriterion("pot_Life <", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeLessThanOrEqualTo(String value) {
            addCriterion("pot_Life <=", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeLike(String value) {
            addCriterion("pot_Life like", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeNotLike(String value) {
            addCriterion("pot_Life not like", value, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeIn(List<String> values) {
            addCriterion("pot_Life in", values, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeNotIn(List<String> values) {
            addCriterion("pot_Life not in", values, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeBetween(String value1, String value2) {
            addCriterion("pot_Life between", value1, value2, "potLife");
            return (Criteria) this;
        }

        public Criteria andPotLifeNotBetween(String value1, String value2) {
            addCriterion("pot_Life not between", value1, value2, "potLife");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("valid_Days is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("valid_Days is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(String value) {
            addCriterion("valid_Days =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(String value) {
            addCriterion("valid_Days <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(String value) {
            addCriterion("valid_Days >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(String value) {
            addCriterion("valid_Days >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(String value) {
            addCriterion("valid_Days <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(String value) {
            addCriterion("valid_Days <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLike(String value) {
            addCriterion("valid_Days like", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotLike(String value) {
            addCriterion("valid_Days not like", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<String> values) {
            addCriterion("valid_Days in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<String> values) {
            addCriterion("valid_Days not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(String value1, String value2) {
            addCriterion("valid_Days between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(String value1, String value2) {
            addCriterion("valid_Days not between", value1, value2, "validDays");
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