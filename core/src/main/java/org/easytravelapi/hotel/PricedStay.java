package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Amount;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "One instance for each occupancy (number of rooms - pax - ages)")
public class PricedStay {
    @ApiModelProperty(value = "Occupancy you need in <nr of rooms>x<pax>[-<age>]* format. E.g.: 2x4-10-6-2 2 rooms occupied by 4 pax where 3 of them are 10, 6 and 2 years old")
    private String occupancy;
    @ApiModelProperty(value = "Desired room id")
    private String roomId;
    @ApiModelProperty(value = "Desired room name")
    private String roomName;
    @ApiModelProperty(value = "Desired board id")
    private String boardId;
    @ApiModelProperty(value = "Desired board name")
    private String boardName;
    @ApiModelProperty(value = "Desired rate id")
    private String rateId;
    @ApiModelProperty(value = "Semicolon separated list of desired supplements in format id#qty;id#qty;id#qty")
    private String supplements;
    @ApiModelProperty(value = "Passengers info. Applies only when confirming")
    private List<PaxDetails> pax  = new ArrayList<>();


    @ApiModelProperty(value = "Retail price")
    private Double retailPrice;
    @ApiModelProperty(value = "Net price")
    private Double netPrice;


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

    @ApiModelProperty(value = "List of available optional supplements")
    private List<Supplement> availableSupplements = new ArrayList<>();

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public List<PaxDetails> getPax() {
        return pax;
    }

    public void setPax(List<PaxDetails> pax) {
        this.pax = pax;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
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

    public List<Supplement> getAvailableSupplements() {
        return availableSupplements;
    }

    public void setAvailableSupplements(List<Supplement> availableSupplements) {
        this.availableSupplements = availableSupplements;
    }
}
