package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Amount;
import org.easytravelapi.common.PaymentLine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An availabe board basis and its price")
public class BoardPrice {

    @ApiModelProperty(value = "Board basis id")
    private String boardBasisId;
    @ApiModelProperty(value = "Board basis name")
    private String boardBasisName;

    private String rateClass;

    private Amount retailPrice;
    private Amount netPrice;
    private Amount commission;
    private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();


    @ApiModelProperty(value = "A flag to state that this price is an offer")
    private boolean offer;
    @ApiModelProperty(value = "The offer description, if this is an offer price")
    private String offerText;

    @ApiModelProperty(value = "A flag to state that this price is only available on request")
    private boolean onRequest;
    @ApiModelProperty(value = "Describes why this price is on request")
    private String onRequestText;

    @ApiModelProperty(value = "A flag to state that this price is not refundable. No cancellation is allowed")
    private boolean nonRefundable;

    private String rateId;

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public String getRateClass() {
        return rateClass;
    }

    public void setRateClass(String rateClass) {
        this.rateClass = rateClass;
    }

    public List<PaymentLine> getPaymentLines() {
        return paymentLines;
    }

    public void setPaymentLines(List<PaymentLine> paymentLines) {
        this.paymentLines = paymentLines;
    }

    public String getBoardBasisId() {
        return boardBasisId;
    }

    public void setBoardBasisId(String boardBasisId) {
        this.boardBasisId = boardBasisId;
    }

    public String getBoardBasisName() {
        return boardBasisName;
    }

    public void setBoardBasisName(String boardBasisName) {
        this.boardBasisName = boardBasisName;
    }

    public Amount getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Amount retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Amount getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Amount netPrice) {
        this.netPrice = netPrice;
    }

    public Amount getCommission() {
        return commission;
    }

    public void setCommission(Amount commission) {
        this.commission = commission;
    }

    public boolean isOffer() {
        return offer;
    }

    public void setOffer(boolean offer) {
        this.offer = offer;
    }

    public String getOfferText() {
        return offerText;
    }

    public void setOfferText(String offerText) {
        this.offerText = offerText;
    }

    public boolean isOnRequest() {
        return onRequest;
    }

    public void setOnRequest(boolean onRequest) {
        this.onRequest = onRequest;
    }

    public String getOnRequestText() {
        return onRequestText;
    }

    public void setOnRequestText(String onRequestText) {
        this.onRequestText = onRequestText;
    }

    public boolean isNonRefundable() {
        return nonRefundable;
    }

    public void setNonRefundable(boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }
}
