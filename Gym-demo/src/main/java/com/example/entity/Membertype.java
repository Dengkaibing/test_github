package com.example.entity;

public class Membertype {
    private String typeName;

    private Double productDiscount;

    private Integer rechargeMoney;

    private Integer givenMoney;

    private String potLife;

    private String validDays;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Double getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Double productDiscount) {
        this.productDiscount = productDiscount;
    }

    public Integer getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Integer rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public Integer getGivenMoney() {
        return givenMoney;
    }

    public void setGivenMoney(Integer givenMoney) {
        this.givenMoney = givenMoney;
    }

    public String getPotLife() {
        return potLife;
    }

    public void setPotLife(String potLife) {
        this.potLife = potLife == null ? null : potLife.trim();
    }

    public String getValidDays() {
        return validDays;
    }

    public void setValidDays(String validDays) {
        this.validDays = validDays == null ? null : validDays.trim();
    }
}