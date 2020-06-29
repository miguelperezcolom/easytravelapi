package org.easytravelapi.agent;

import java.util.List;

public class CartList {

    private String fileId;

    private String agencyReference;

    private String productionCenterId;

    private String date;

    private Personaldata personaldata;

    private String total;

    private Payments[] payments;

    private Cart[] cart;

    private String status;

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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getAgencyReference() {
        return agencyReference;
    }

    public void setAgencyReference(String agencyReference) {
        this.agencyReference = agencyReference;
    }

    public String getProductionCenterId() {
        return productionCenterId;
    }

    public void setProductionCenterId(String productionCenterId) {
        this.productionCenterId = productionCenterId;
    }
}
