package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * An availabe board basis and its price
 */
@ApiModel(description = "An availabe board basis and its price")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class BoardPrice {
  @SerializedName("key")
  private String key = null;

  @SerializedName("boardBasisId")
  private String boardBasisId = null;

  @SerializedName("boardBasisName")
  private String boardBasisName = null;

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

  public BoardPrice key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Identifier for this room combination and board basis. You will use it in next steps
   * @return key
  **/
  @ApiModelProperty(value = "Identifier for this room combination and board basis. You will use it in next steps")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BoardPrice boardBasisId(String boardBasisId) {
    this.boardBasisId = boardBasisId;
    return this;
  }

   /**
   * Board basis id
   * @return boardBasisId
  **/
  @ApiModelProperty(value = "Board basis id")
  public String getBoardBasisId() {
    return boardBasisId;
  }

  public void setBoardBasisId(String boardBasisId) {
    this.boardBasisId = boardBasisId;
  }

  public BoardPrice boardBasisName(String boardBasisName) {
    this.boardBasisName = boardBasisName;
    return this;
  }

   /**
   * Board basis name
   * @return boardBasisName
  **/
  @ApiModelProperty(value = "Board basis name")
  public String getBoardBasisName() {
    return boardBasisName;
  }

  public void setBoardBasisName(String boardBasisName) {
    this.boardBasisName = boardBasisName;
  }

  public BoardPrice retailPrice(Amount retailPrice) {
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

  public BoardPrice netPrice(Amount netPrice) {
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

  public BoardPrice commission(Amount commission) {
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

  public BoardPrice offer(Boolean offer) {
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

  public BoardPrice offerText(String offerText) {
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

  public BoardPrice onRequest(Boolean onRequest) {
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

  public BoardPrice onRequestText(String onRequestText) {
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

  public BoardPrice nonRefundable(Boolean nonRefundable) {
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
    BoardPrice boardPrice = (BoardPrice) o;
    return Objects.equals(this.key, boardPrice.key) &&
        Objects.equals(this.boardBasisId, boardPrice.boardBasisId) &&
        Objects.equals(this.boardBasisName, boardPrice.boardBasisName) &&
        Objects.equals(this.retailPrice, boardPrice.retailPrice) &&
        Objects.equals(this.netPrice, boardPrice.netPrice) &&
        Objects.equals(this.commission, boardPrice.commission) &&
        Objects.equals(this.offer, boardPrice.offer) &&
        Objects.equals(this.offerText, boardPrice.offerText) &&
        Objects.equals(this.onRequest, boardPrice.onRequest) &&
        Objects.equals(this.onRequestText, boardPrice.onRequestText) &&
        Objects.equals(this.nonRefundable, boardPrice.nonRefundable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, boardBasisId, boardBasisName, retailPrice, netPrice, commission, offer, offerText, onRequest, onRequestText, nonRefundable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardPrice {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    boardBasisId: ").append(toIndentedString(boardBasisId)).append("\n");
    sb.append("    boardBasisName: ").append(toIndentedString(boardBasisName)).append("\n");
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

