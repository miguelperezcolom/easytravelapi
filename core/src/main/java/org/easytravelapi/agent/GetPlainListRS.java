package org.easytravelapi.agent;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.cms.ActivityCheckItem;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetPlainListRS extends AbstractRS {
    @ApiModelProperty(value = "List of available excursions, to check")
    private List<ActivityCheckItem> activity = new ArrayList<ActivityCheckItem>();

    private List<PlainActivityItem> plainActivities = new ArrayList<>();

    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    private List<CurrencyChange> currencies = new ArrayList<>();

    private CompanyData companyData;

    public List<ActivityCheckItem> getActivity() {
        return activity;
    }

    public void setActivity(List<ActivityCheckItem> activity) {
        this.activity = activity;
    }

    public List<PlainActivityItem> getPlainActivities() {
        return plainActivities;
    }

    public void setPlainActivities(List<PlainActivityItem> plainActivities) {
        this.plainActivities = plainActivities;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<CurrencyChange> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrencyChange> currencies) {
        this.currencies = currencies;
    }


    public CompanyData getCompanyData() {
        return companyData;
    }

    public void setCompanyData(CompanyData companyData) {
        this.companyData = companyData;
    }
}
