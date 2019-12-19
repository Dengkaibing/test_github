package com.example.entity;

public class Warehouse {
    private Integer productId;

    private String productName;

    private String productType;

    private Double sellPrice;

    private Double purchchasingPrice;

    private Integer stockNumber;

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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getPurchchasingPrice() {
        return purchchasingPrice;
    }

    public void setPurchchasingPrice(Double purchchasingPrice) {
        this.purchchasingPrice = purchchasingPrice;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }
}