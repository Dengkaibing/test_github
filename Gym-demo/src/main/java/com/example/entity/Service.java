package com.example.entity;

public class Service {
    private String serviceId;

    private String serviceName;

    private String serviceType;

    private Double servicePrice;

    private String serviceCredit;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceCredit() {
        return serviceCredit;
    }

    public void setServiceCredit(String serviceCredit) {
        this.serviceCredit = serviceCredit == null ? null : serviceCredit.trim();
    }
}