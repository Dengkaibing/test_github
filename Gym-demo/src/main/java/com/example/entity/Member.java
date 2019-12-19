package com.example.entity;

public class Member {
    private Integer memberId;

    private String memberName;

    private String memberSex;

    private Integer memberIdcard;

    private String memberType;

    private String memberTelephone;

    private String memberCounselor;

    private Double cardBalance;

    private Integer credit;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex == null ? null : memberSex.trim();
    }

    public Integer getMemberIdcard() {
        return memberIdcard;
    }

    public void setMemberIdcard(Integer memberIdcard) {
        this.memberIdcard = memberIdcard;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getMemberTelephone() {
        return memberTelephone;
    }

    public void setMemberTelephone(String memberTelephone) {
        this.memberTelephone = memberTelephone == null ? null : memberTelephone.trim();
    }

    public String getMemberCounselor() {
        return memberCounselor;
    }

    public void setMemberCounselor(String memberCounselor) {
        this.memberCounselor = memberCounselor == null ? null : memberCounselor.trim();
    }

    public Double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}