package com.example.entity;

public class Memberrecharge {
    private Integer numbers;

    private String rechargeDate;

    private Integer memberIdcard;

    private String memberName;

    private String memberTypename;

    private String rechargeType;

    private Integer realrecharge;

    private Integer currentBlance;

    private String payment;

    private String employees;

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(String rechargeDate) {
        this.rechargeDate = rechargeDate == null ? null : rechargeDate.trim();
    }

    public Integer getMemberIdcard() {
        return memberIdcard;
    }

    public void setMemberIdcard(Integer memberIdcard) {
        this.memberIdcard = memberIdcard;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberTypename() {
        return memberTypename;
    }

    public void setMemberTypename(String memberTypename) {
        this.memberTypename = memberTypename == null ? null : memberTypename.trim();
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType == null ? null : rechargeType.trim();
    }

    public Integer getRealrecharge() {
        return realrecharge;
    }

    public void setRealrecharge(Integer realrecharge) {
        this.realrecharge = realrecharge;
    }

    public Integer getCurrentBlance() {
        return currentBlance;
    }

    public void setCurrentBlance(Integer currentBlance) {
        this.currentBlance = currentBlance;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees == null ? null : employees.trim();
    }
}