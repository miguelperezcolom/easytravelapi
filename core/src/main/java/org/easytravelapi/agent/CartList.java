package org.easytravelapi.agent;

import java.util.List;

public class CartList {
    private String date;

    private Personaldata personaldata;

    private String total;

    private Payments[] payments;

    private Cart[] cart;

    private String status;

    private CompanyData companyData;

    private String qrCode;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Personaldata getPersonaldata() {
        return personaldata;
    }

    public void setPersonaldata(Personaldata personaldata) {
        this.personaldata = personaldata;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Payments[] getPayments() {
        return payments;
    }

    public void setPayments(Payments[] payments) {
        this.payments = payments;
    }

    public Cart[] getCart() {
        return cart;
    }

    public void setCart(Cart[] cart) {
        this.cart = cart;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CompanyData getCompanyData() {
        return companyData;
    }

    public void setCompanyData(CompanyData companyData) {
        this.companyData = companyData;
    }
}
