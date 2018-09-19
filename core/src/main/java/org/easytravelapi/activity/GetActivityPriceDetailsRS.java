package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetActivityPriceDetailsRS extends AbstractRS {

    private String key;

    private List<PriceLine> priceLines = new ArrayList<>();

    private BestDeal total;

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    public List<CancellationCost> getCancellationCosts() {
        return cancellationCosts;
    }

    public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
        this.cancellationCosts = cancellationCosts;
    }

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<PriceLine> getPriceLines() {
        return priceLines;
    }

    public void setPriceLines(List<PriceLine> priceLines) {
        this.priceLines = priceLines;
    }

    public BestDeal getTotal() {
        return total;
    }

    public void setTotal(BestDeal total) {
        this.total = total;
    }

    public List<PaymentLine> getPaymentLines() { return paymentLines; }

    public void setPaymentLines(List<PaymentLine> paymentLines) { this.paymentLines = paymentLines; }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}

