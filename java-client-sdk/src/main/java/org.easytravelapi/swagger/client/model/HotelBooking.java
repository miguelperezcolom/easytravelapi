package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Amount;
import io.swagger.client.model.Stay;
import java.util.ArrayList;
import java.util.List;

/**
 * A booking service
 */
@ApiModel(description = "A booking service")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class HotelBooking {
  @SerializedName("bookingId")
  private String bookingId = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("modified")
  private String modified = null;

  @SerializedName("serviceType")
  private String serviceType = null;

  @SerializedName("serviceDescription")
  private String serviceDescription = null;

  @SerializedName("start")
  private String start = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("leadName")
  private String leadName = null;

  @SerializedName("retailValue")
  private Amount retailValue = null;

  @SerializedName("netValue")
  private Amount netValue = null;

  @SerializedName("commissionValue")
  private Amount commissionValue = null;

  @SerializedName("commentsToProvider")
  private String commentsToProvider = null;

  @SerializedName("privateComments")
  private String privateComments = null;

  @SerializedName("stays")
  private List<Stay> stays = new ArrayList<Stay>();

  public HotelBooking bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

   /**
   * The booking id
   * @return bookingId
  **/
  @ApiModelProperty(value = "The booking id")
  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public HotelBooking created(String created) {
    this.created = created;
    return this;
  }

   /**
   * When this service was created. In ISO8651 format
   * @return created
  **/
  @ApiModelProperty(value = "When this service was created. In ISO8651 format")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public HotelBooking createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Who created this service booking
   * @return createdBy
  **/
  @ApiModelProperty(value = "Who created this service booking")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public HotelBooking modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Last modification date for this service in ISO8651 format
   * @return modified
  **/
  @ApiModelProperty(value = "Last modification date for this service in ISO8651 format")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public HotelBooking serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Type of service. Intended to be HOTEL, TRANSFER, ACTIVITY, ...
   * @return serviceType
  **/
  @ApiModelProperty(value = "Type of service. Intended to be HOTEL, TRANSFER, ACTIVITY, ...")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public HotelBooking serviceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

   /**
   * Description of the service
   * @return serviceDescription
  **/
  @ApiModelProperty(value = "Description of the service")
  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public HotelBooking start(String start) {
    this.start = start;
    return this;
  }

   /**
   * When this service starts using locale. In YYYYMMDD format
   * @return start
  **/
  @ApiModelProperty(value = "When this service starts using locale. In YYYYMMDD format")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public HotelBooking end(String end) {
    this.end = end;
    return this;
  }

   /**
   * When this service ends using locale. In YYYYMMDD format
   * @return end
  **/
  @ApiModelProperty(value = "When this service ends using locale. In YYYYMMDD format")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public HotelBooking status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status for this service. E.g. OK, ONREQUEST, CANCELLED, ...
   * @return status
  **/
  @ApiModelProperty(value = "Status for this service. E.g. OK, ONREQUEST, CANCELLED, ...")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HotelBooking leadName(String leadName) {
    this.leadName = leadName;
    return this;
  }

   /**
   * This service lead name
   * @return leadName
  **/
  @ApiModelProperty(value = "This service lead name")
  public String getLeadName() {
    return leadName;
  }

  public void setLeadName(String leadName) {
    this.leadName = leadName;
  }

  public HotelBooking retailValue(Amount retailValue) {
    this.retailValue = retailValue;
    return this;
  }

   /**
   * Get retailValue
   * @return retailValue
  **/
  @ApiModelProperty(value = "")
  public Amount getRetailValue() {
    return retailValue;
  }

  public void setRetailValue(Amount retailValue) {
    this.retailValue = retailValue;
  }

  public HotelBooking netValue(Amount netValue) {
    this.netValue = netValue;
    return this;
  }

   /**
   * Get netValue
   * @return netValue
  **/
  @ApiModelProperty(value = "")
  public Amount getNetValue() {
    return netValue;
  }

  public void setNetValue(Amount netValue) {
    this.netValue = netValue;
  }

  public HotelBooking commissionValue(Amount commissionValue) {
    this.commissionValue = commissionValue;
    return this;
  }

   /**
   * Get commissionValue
   * @return commissionValue
  **/
  @ApiModelProperty(value = "")
  public Amount getCommissionValue() {
    return commissionValue;
  }

  public void setCommissionValue(Amount commissionValue) {
    this.commissionValue = commissionValue;
  }

  public HotelBooking commentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
    return this;
  }

   /**
   * Comments from the customer
   * @return commentsToProvider
  **/
  @ApiModelProperty(value = "Comments from the customer")
  public String getCommentsToProvider() {
    return commentsToProvider;
  }

  public void setCommentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
  }

  public HotelBooking privateComments(String privateComments) {
    this.privateComments = privateComments;
    return this;
  }

   /**
   * Comments for you. Not to be shown to the customer
   * @return privateComments
  **/
  @ApiModelProperty(value = "Comments for you. Not to be shown to the customer")
  public String getPrivateComments() {
    return privateComments;
  }

  public void setPrivateComments(String privateComments) {
    this.privateComments = privateComments;
  }

  public HotelBooking stays(List<Stay> stays) {
    this.stays = stays;
    return this;
  }

  public HotelBooking addStaysItem(Stay staysItem) {
    this.stays.add(staysItem);
    return this;
  }

   /**
   * List of stays (rooms, occupation and boards)
   * @return stays
  **/
  @ApiModelProperty(value = "List of stays (rooms, occupation and boards)")
  public List<Stay> getStays() {
    return stays;
  }

  public void setStays(List<Stay> stays) {
    this.stays = stays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelBooking hotelBooking = (HotelBooking) o;
    return Objects.equals(this.bookingId, hotelBooking.bookingId) &&
        Objects.equals(this.created, hotelBooking.created) &&
        Objects.equals(this.createdBy, hotelBooking.createdBy) &&
        Objects.equals(this.modified, hotelBooking.modified) &&
        Objects.equals(this.serviceType, hotelBooking.serviceType) &&
        Objects.equals(this.serviceDescription, hotelBooking.serviceDescription) &&
        Objects.equals(this.start, hotelBooking.start) &&
        Objects.equals(this.end, hotelBooking.end) &&
        Objects.equals(this.status, hotelBooking.status) &&
        Objects.equals(this.leadName, hotelBooking.leadName) &&
        Objects.equals(this.retailValue, hotelBooking.retailValue) &&
        Objects.equals(this.netValue, hotelBooking.netValue) &&
        Objects.equals(this.commissionValue, hotelBooking.commissionValue) &&
        Objects.equals(this.commentsToProvider, hotelBooking.commentsToProvider) &&
        Objects.equals(this.privateComments, hotelBooking.privateComments) &&
        Objects.equals(this.stays, hotelBooking.stays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, created, createdBy, modified, serviceType, serviceDescription, start, end, status, leadName, retailValue, netValue, commissionValue, commentsToProvider, privateComments, stays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelBooking {\n");
    
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
    sb.append("    retailValue: ").append(toIndentedString(retailValue)).append("\n");
    sb.append("    netValue: ").append(toIndentedString(netValue)).append("\n");
    sb.append("    commissionValue: ").append(toIndentedString(commissionValue)).append("\n");
    sb.append("    commentsToProvider: ").append(toIndentedString(commentsToProvider)).append("\n");
    sb.append("    privateComments: ").append(toIndentedString(privateComments)).append("\n");
    sb.append("    stays: ").append(toIndentedString(stays)).append("\n");
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

