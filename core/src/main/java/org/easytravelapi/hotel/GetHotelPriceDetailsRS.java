package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the hotel price details response")
public class GetHotelPriceDetailsRS extends AbstractRS {

    private String status;
    private BestDeal total;
    @ApiModelProperty(value = "List of pricing")
    private List<PriceLine> prices  = new ArrayList<PriceLine>();

    private List<Service> availableServices = new ArrayList<Service>();

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    @ApiModelProperty(value = "RateKey and occupation for each selected option")
    private List<RateKey> rateKeys = new ArrayList<RateKey>();

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    private String couponMsg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BestDeal getTotal() { return total; }

    public void setTotal(BestDeal total) { this.total = total; }

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

    public String getCouponMsg() { return couponMsg; }

    public void setCouponMsg(String couponMsg) { this.couponMsg = couponMsg; }
}
