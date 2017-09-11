package org.easytravelapi.hotel;

import org.easytravelapi.common.Amount;

/**
 * Created by miguel on 26/7/17.
 */
public class BoardPrice {

    private String key;

    private String boardBasisId;
    private String boardBasisName;

    private Amount grossPrice;
    private Amount netPrice;
    private Amount commission;


    private boolean offer;
    private String offerText;

    private boolean onRequest;
    private String onRequestText;

    private boolean nonRefundable;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public Amount getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(Amount grossPrice) {
        this.grossPrice = grossPrice;
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
