package org.easytravelapi.agent;

import org.easytravelapi.activity.PaymentMethod;

public class Payments {

    private String amount;

    private PaymentMethod paymentMethod;

    private CurrencyChange currency;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CurrencyChange getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyChange currency) {
        this.currency = currency;
    }
}
