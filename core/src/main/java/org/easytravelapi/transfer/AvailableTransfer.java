package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Price;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available transfer")
public class AvailableTransfer {

    @ApiModelProperty(value = "Identifier for this transfer price. You will use it in next steps")
    private String key;


    //todo: revisar y completar la lista si hace falta
    @ApiModelProperty(value = "Type of transfer. E.G. SHUTTLE, PRIVATE")
    private String type;
    @ApiModelProperty(value = "Vehicle")
    private String vehicle;
    @ApiModelProperty(value = "Description of the service")
    private String description;

    @ApiModelProperty(value = "Main image from transfer.")
    private String image;

    private Price total;


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


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Price getTotal() {
        return total;
    }

    public void setTotal(Price total) {
        this.total = total;
    }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }
}
