package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Holder for price")
public class Price {

    @ApiModelProperty(value = "Currency iso code for all prices")
    private String currencyIsoCode;

    @ApiModelProperty(value = "Retail price")
    private Double retail;
    @ApiModelProperty(value = "Net price")
    private Double net;
    @ApiModelProperty(value = "True if this an offer price")
    private boolean offer;
    @ApiModelProperty(value = "Offer title, if available")
    private String offerText;
    @ApiModelProperty(value = "Price before offer. Applies to retail price if present")
    private double beforeOffer;

    public Price() {
    }

    public Price(String currencyIsoCode, Double retail, Double net) {
        this.currencyIsoCode = currencyIsoCode;
        this.retail = retail;
        this.net = net;
    }

    public Price(String currencyIsoCode, Double retail, Double net, boolean offer, String offerText, double beforeOffer) {
        this.currencyIsoCode = currencyIsoCode;
        this.retail = retail;
        this.net = net;
        this.offer = offer;
        this.offerText = offerText;
        this.beforeOffer = beforeOffer;
    }

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public Double getRetail() {
        return retail;
    }

    public void setRetail(Double retail) {
        this.retail = retail;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
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

    public double getBeforeOffer() {
        return beforeOffer;
    }

    public void setBeforeOffer(double beforeOffer) {
        this.beforeOffer = beforeOffer;
    }
}
