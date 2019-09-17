package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.common.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetTransferPriceDetailsRS extends AbstractRS {


    private List<PriceLine> priceLines = new ArrayList<>();

    private BestDeal total;

    private String arrivalInstructions;

    private String departureInstructions;

    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    private String terms;

    private String mailingUnwantedText;

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

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public List<PaymentLine> getPaymentLines() { return paymentLines; }

    public void setPaymentLines(List<PaymentLine> paymentLines) { this.paymentLines = paymentLines; }

    public String getArrivalInstructions() {
        return arrivalInstructions;
    }

    public void setArrivalInstructions(String arrivalInstructions) {
        this.arrivalInstructions = arrivalInstructions;
    }

    public String getDepartureInstructions() {
        return departureInstructions;
    }

    public void setDepartureInstructions(String departureInstructions) {
        this.departureInstructions = departureInstructions;
    }

    public String getTerms() { return terms; }

    public void setTerms(String terms) { this.terms = terms; }

    public String getMailingUnwantedText() { return mailingUnwantedText; }

    public void setMailingUnwantedText(String mailingUnwantedText) { this.mailingUnwantedText = mailingUnwantedText; }
}
