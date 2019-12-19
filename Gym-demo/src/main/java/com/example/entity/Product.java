package com.example.entity;

public class Product {
    private Integer productId;

    private String productName;

    private Double productPrice;

    private String productType;

    private String productCredit;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductCredit() {
        return productCredit;
    }

    public void setProductCredit(String productCredit) {
        this.productCredit = productCredit == null ? null : productCredit.trim();
    }
}