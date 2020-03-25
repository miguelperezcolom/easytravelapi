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

    @ApiModelProperty(value = "Status. Possible values are OK and ON REQUEST")
    private String status;

    @ApiModelProperty(value = "Total price")
    private Price total;

    @ApiModelProperty(value = "Price detail, in form of lines")
    private List<PriceLine> priceBreakdown = new ArrayList<PriceLine>();

    @ApiModelProperty(value = "Cancellation costs")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "No cancellation cost until this date, yyyy-MM-dd formatted")
    private String cancellationFreeDate;

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    @ApiModelProperty(value = "RateKey and occupation for each selected option")
    private List<RateKey> rateKeys = new ArrayList<RateKey>();

    @ApiModelProperty(value = "Detailed Payment lines")
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

    @ApiModelProperty(value = "Promo code application result")
    private String promoCodeMsg;

    @ApiModelProperty(value = "Terms and conditions text. For website usage only")
    private String terms;

    @ApiModelProperty(value = "Mailing unwanted text. For website usage only")
    private String mailingUnwantedText;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Price getTotal() {
        return total;
    }

    public void setTotal(Price total) {
        this.total = total;
    }

    public List<PriceLine> getPriceBreakdown() {
        return priceBreakdown;
    }

    public void setPriceBreakdown(List<PriceLine> priceBreakdown) {
        this.priceBreakdown = priceBreakdown;
    }

    public List<CancellationCost> getCancellationCosts() {
        return cancellationCosts;
    }

    public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
        this.cancellationCosts = cancellationCosts;
    }

    public String getCancellationFreeDate() {
        return cancellationFreeDate;
    }

    public void setCancellationFreeDate(String cancellationFreeDate) {
        this.cancellationFreeDate = cancellationFreeDate;
    }

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

    public List<RateKey> getRateKeys() {
        return rateKeys;
    }

    public void setRateKeys(List<RateKey> rateKeys) {
        this.rateKeys = rateKeys;
    }

    public List<PaymentLine> getPaymentLines() {
        return paymentLines;
    }

    public void setPaymentLines(List<PaymentLine> paymentLines) {
        this.paymentLines = paymentLines;
    }

    public String getPromoCodeMsg() {
        return promoCodeMsg;
    }

    public void setPromoCodeMsg(String promoCodeMsg) {
        this.promoCodeMsg = promoCodeMsg;
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
}
