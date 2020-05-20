package org.easytravelapi.flight;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.*;

import java.util.ArrayList;
import java.util.List;

public class GetFlightPriceDetailsRS extends AbstractRS {

    @ApiModelProperty(value = "Price detail, in form of lines")
    private List<PriceLine> priceBreakdown = new ArrayList<PriceLine>();

    @ApiModelProperty(value = "Totals and currency for all prices")
    private Price total;

    @ApiModelProperty(value = "Available supplements")
    private List<Supplement> availableSupplements = new ArrayList<>();

    @ApiModelProperty(value = "Arrival instructions")
    private String arrivalInstructions;

    @ApiModelProperty(value = "Departure instructions")
    private String departureInstructions;

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    @ApiModelProperty(value = "Text for terms and conditions")
    private String terms;

    @ApiModelProperty(value = "Text for rejecting or acepting mailing")
    private String mailingUnwantedText;

    @ApiModelProperty(value = "No cancellation costs until this date, in yyyy-MM-dd format")
    private String cancellationFreeDate;

    public List<PriceLine> getPriceBreakdown() {
        return priceBreakdown;
    }

    public void setPriceBreakdown(List<PriceLine> priceBreakdown) {
        this.priceBreakdown = priceBreakdown;
    }

    public Price getTotal() {
        return total;
    }

    public void setTotal(Price total) {
        this.total = total;
    }

    public List<Supplement> getAvailableSupplements() {
        return availableSupplements;
    }

    public void setAvailableSupplements(List<Supplement> availableSupplements) {
        this.availableSupplements = availableSupplements;
    }

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

    public List<PaymentLine> getPaymentLines() {
        return paymentLines;
    }

    public void setPaymentLines(List<PaymentLine> paymentLines) {
        this.paymentLines = paymentLines;
    }

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

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getMailingUnwantedText() {
        return mailingUnwantedText;
    }

    public void setMailingUnwantedText(String mailingUnwantedText) {
        this.mailingUnwantedText = mailingUnwantedText;
    }

    public String getCancellationFreeDate() {
        return cancellationFreeDate;
    }

    public void setCancellationFreeDate(String cancellationFreeDate) {
        this.cancellationFreeDate = cancellationFreeDate;
    }
}