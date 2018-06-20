package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.hotel.PriceLine;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Amount;
import org.easytravelapi.common.CancellationCost;
import org.easytravelapi.common.Remark;

import javax.xml.bind.PrintConversionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the hotel price details response")
public class GetHotelPriceDetailsRS extends AbstractRS {

    private String status;
    @ApiModelProperty(value = "List of pricing")
    private List<PriceLine> prices  = new ArrayList<org.easytravelapi.hotel.PriceLine>();

    private List<Service> availableServices = new ArrayList<Service>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    @ApiModelProperty(value = "RateKey and occupation for each selected option")
    private List<RateKey> rateKeys = new ArrayList<RateKey>();

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PriceLine> getPrices() { return prices; }

    public void setPrices(List<PriceLine> prices) { this.prices = prices; }

    public List<Service> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(List<Service> availableServices) {
        this.availableServices = availableServices;
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

    public List<RateKey> getRateKeys() { return rateKeys; }

    public void setRateKeys(List<RateKey> rateKeys) { this.rateKeys = rateKeys; }

    public List<PaymentLine> getPaymentLines() { return paymentLines;}

    public void setPaymentLines(List<PaymentLine> paymentLines) { this.paymentLines = paymentLines; }
}
