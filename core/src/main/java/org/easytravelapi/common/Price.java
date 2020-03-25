package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Holder for price")
public class Price {

    @ApiModelProperty(value = "Retail price")
    private Amount retail;
    @ApiModelProperty(value = "Net price")
    private Amount net;
    @ApiModelProperty(value = "True if this an offer price")
    private boolean offer;
    @ApiModelProperty(value = "Offer title, if available")
    private String offerText;
    @ApiModelProperty(value = "Price before offer. Applies to retail price if present")
    private Amount beforeOffer;

    public Amount getRetail() {
        return retail;
    }

    public void setRetail(Amount retail) {
        this.retail = retail;
    }

    public Amount getNet() {
        return net;
    }

    public void setNet(Amount net) {
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

    public Amount getBeforeOffer() {
        return beforeOffer;
    }

    public void setBeforeOffer(Amount beforeOffer) {
        this.beforeOffer = beforeOffer;
    }
}
