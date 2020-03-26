package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An availabe board basis and its price")
public class OptionBoardPrice {

    @ApiModelProperty(value = "Board basis id")
    private String boardBasisId;
    @ApiModelProperty(value = "Board basis name")
    private String boardBasisName;

    @ApiModelProperty(value = "Retail price")
    private double retailPrice;
    @ApiModelProperty(value = "Net price")
    private double netPrice;


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

    @ApiModelProperty(value = "Rate id")
    private String rateId;



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

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
}
