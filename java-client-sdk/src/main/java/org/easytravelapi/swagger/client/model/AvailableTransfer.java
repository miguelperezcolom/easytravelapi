package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * An available transfer
 */
@ApiModel(description = "An available transfer")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class AvailableTransfer {
  @SerializedName("key")
  private String key = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("vehicle")
  private String vehicle = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("retailPrice")
  private Amount retailPrice = null;

  @SerializedName("netPrice")
  private Amount netPrice = null;

  @SerializedName("commission")
  private Amount commission = null;

  @SerializedName("offer")
  private Boolean offer = false;

  @SerializedName("offerText")
  private String offerText = null;

  @SerializedName("onRequest")
  private Boolean onRequest = false;

  @SerializedName("onRequestText")
  private String onRequestText = null;

  @SerializedName("nonRefundable")
  private Boolean nonRefundable = false;

  public AvailableTransfer key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Identifier for this transfer price. You will use it in next steps
   * @return key
  **/
  @ApiModelProperty(value = "Identifier for this transfer price. You will use it in next steps")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AvailableTransfer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of transfer. E.G. SHUTTLE, PRIVATE
   * @return type
  **/
  @ApiModelProperty(value = "Type of transfer. E.G. SHUTTLE, PRIVATE")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AvailableTransfer vehicle(String vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Vehicle
   * @return vehicle
  **/
  @ApiModelProperty(value = "Vehicle")
  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }

  public AvailableTransfer description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the service
   * @return description
  **/
  @ApiModelProperty(value = "Description of the service")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AvailableTransfer retailPrice(Amount retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

   /**
   * Get retailPrice
   * @return retailPrice
  **/
  @ApiModelProperty(value = "")
  public Amount getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(Amount retailPrice) {
    this.retailPrice = retailPrice;
  }

  public AvailableTransfer netPrice(Amount netPrice) {
    this.netPrice = netPrice;
    return this;
  }

   /**
   * Get netPrice
   * @return netPrice
  **/
  @ApiModelProperty(value = "")
  public Amount getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(Amount netPrice) {
    this.netPrice = netPrice;
  }

  public AvailableTransfer commission(Amount commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @ApiModelProperty(value = "")
  public Amount getCommission() {
    return commission;
  }

  public void setCommission(Amount commission) {
    this.commission = commission;
  }

  public AvailableTransfer offer(Boolean offer) {
    this.offer = offer;
    return this;
  }

   /**
   * A flag to state that this price is an offer
   * @return offer
  **/
  @ApiModelProperty(value = "A flag to state that this price is an offer")
  public Boolean getOffer() {
    return offer;
  }

  public void setOffer(Boolean offer) {
    this.offer = offer;
  }

  public AvailableTransfer offerText(String offerText) {
    this.offerText = offerText;
    return this;
  }

   /**
   * The offer description, if this is an offer price
   * @return offerText
  **/
  @ApiModelProperty(value = "The offer description, if this is an offer price")
  public String getOfferText() {
    return offerText;
  }

  public void setOfferText(String offerText) {
    this.offerText = offerText;
  }

  public AvailableTransfer onRequest(Boolean onRequest) {
    this.onRequest = onRequest;
    return this;
  }

   /**
   * A flag to state that this price is only available on request
   * @return onRequest
  **/
  @ApiModelProperty(value = "A flag to state that this price is only available on request")
  public Boolean getOnRequest() {
    return onRequest;
  }

  public void setOnRequest(Boolean onRequest) {
    this.onRequest = onRequest;
  }

  public AvailableTransfer onRequestText(String onRequestText) {
    this.onRequestText = onRequestText;
    return this;
  }

   /**
   * Describes why this price is on request
   * @return onRequestText
  **/
  @ApiModelProperty(value = "Describes why this price is on request")
  public String getOnRequestText() {
    return onRequestText;
  }

  public void setOnRequestText(String onRequestText) {
    this.onRequestText = onRequestText;
  }

  public AvailableTransfer nonRefundable(Boolean nonRefundable) {
    this.nonRefundable = nonRefundable;
    return this;
  }

   /**
   * A flag to state that this price is not refundable. No cancellation is allowed
   * @return nonRefundable
  **/
  @ApiModelProperty(value = "A flag to state that this price is not refundable. No cancellation is allowed")
  public Boolean getNonRefundable() {
    return nonRefundable;
  }

  public void setNonRefundable(Boolean nonRefundable) {
    this.nonRefundable = nonRefundable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTransfer availableTransfer = (AvailableTransfer) o;
    return Objects.equals(this.key, availableTransfer.key) &&
        Objects.equals(this.type, availableTransfer.type) &&
        Objects.equals(this.vehicle, availableTransfer.vehicle) &&
        Objects.equals(this.description, availableTransfer.description) &&
        Objects.equals(this.retailPrice, availableTransfer.retailPrice) &&
        Objects.equals(this.netPrice, availableTransfer.netPrice) &&
        Objects.equals(this.commission, availableTransfer.commission) &&
        Objects.equals(this.offer, availableTransfer.offer) &&
        Objects.equals(this.offerText, availableTransfer.offerText) &&
        Objects.equals(this.onRequest, availableTransfer.onRequest) &&
        Objects.equals(this.onRequestText, availableTransfer.onRequestText) &&
        Objects.equals(this.nonRefundable, availableTransfer.nonRefundable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, vehicle, description, retailPrice, netPrice, commission, offer, offerText, onRequest, onRequestText, nonRefundable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTransfer {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    offerText: ").append(toIndentedString(offerText)).append("\n");
    sb.append("    onRequest: ").append(toIndentedString(onRequest)).append("\n");
    sb.append("    onRequestText: ").append(toIndentedString(onRequestText)).append("\n");
    sb.append("    nonRefundable: ").append(toIndentedString(nonRefundable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

