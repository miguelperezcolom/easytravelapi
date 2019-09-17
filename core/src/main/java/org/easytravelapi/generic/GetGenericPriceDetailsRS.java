package org.easytravelapi.generic;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.common.*;

import java.util.ArrayList;
import java.util.List;

public class GetGenericPriceDetailsRS extends AbstractRS{
    private String key;

    private List<PriceLine> priceLines = new ArrayList<>();

    private BestDeal total;

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    @ApiModelProperty(value = "Response message from discount coupon applicated")
    private String couponMsg;

    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    private String terms;

    private String mailingUnwantedText;


    public List<CancellationCost> getCancellationCosts() {
        return cancellationCosts;
    }

    public String getKey() { return key; }

    public void setKey(String key) { this.key = key; }

    public List<PriceLine> getPriceLines() { return priceLines; }

    public void setPriceLines(List<PriceLine> priceLines) { this.priceLines = priceLines; }

    public BestDeal getTotal() { return total; }

    public void setTotal(BestDeal total) { this.total = total; }

    public List<PaymentLine> getPaymentLines() { return paymentLines; }

    public void setPaymentLines(List<PaymentLine> paymentLines) { this.paymentLines = paymentLines; }

    public void setCancellationCosts(List<CancellationCost> cancellationCosts) { this.cancellationCosts = cancellationCosts; }

    public List<Remark> getRemarks() { return remarks; }

    public void setRemarks(List<Remark> remarks) { this.remarks = remarks; }

    public List<PaymentMethod> getPaymentMethods() { return paymentMethods; }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) { this.paymentMethods = paymentMethods; }

    public String getCouponMsg() { return couponMsg; }

    public void setCouponMsg(String couponMsg) { this.couponMsg = couponMsg; }

    public String getTerms() { return terms; }

    public void setTerms(String terms) { this.terms = terms; }

    public String getMailingUnwantedText() { return mailingUnwantedText; }

    public void setMailingUnwantedText(String mailingUnwantedText) { this.mailingUnwantedText = mailingUnwantedText; }
}
