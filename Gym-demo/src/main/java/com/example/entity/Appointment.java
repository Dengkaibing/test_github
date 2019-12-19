package com.example.entity;

public class Appointment {
    private Integer appointmentId;

    private String appointmentDate;

    private String appointmentUser;

    private String appointmentPhone;

    private String appointmentProduct;

    private String appointmentTime;

    private String conductor;

    private String appointmentStyle;

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate == null ? null : appointmentDate.trim();
    }

    public String getAppointmentUser() {
        return appointmentUser;
    }

    public void setAppointmentUser(String appointmentUser) {
        this.appointmentUser = appointmentUser == null ? null : appointmentUser.trim();
    }

    public String getAppointmentPhone() {
        return appointmentPhone;
    }

    public void setAppointmentPhone(String appointmentPhone) {
        this.appointmentPhone = appointmentPhone == null ? null : appointmentPhone.trim();
    }

    public String getAppointmentProduct() {
        return appointmentProduct;
    }

    public void setAppointmentProduct(String appointmentProduct) {
        this.appointmentProduct = appointmentProduct == null ? null : appointmentProduct.trim();
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime == null ? null : appointmentTime.trim();
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor == null ? null : conductor.trim();
    }

    public String getAppointmentStyle() {
        return appointmentStyle;
    }

    public void setAppointmentStyle(String appointmentStyle) {
        this.appointmentStyle = appointmentStyle == null ? null : appointmentStyle.trim();
    }
}