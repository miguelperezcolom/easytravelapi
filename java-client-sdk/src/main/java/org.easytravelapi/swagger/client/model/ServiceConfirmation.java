package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Service confirmation data
 */
@ApiModel(description = "Service confirmation data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class ServiceConfirmation {
  @SerializedName("bookingId")
  private String bookingId = null;

  @SerializedName("confirmed")
  private Boolean confirmed = false;

  @SerializedName("comments")
  private String comments = null;

  public ServiceConfirmation bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

   /**
   * Service booking id, as provided by the getroominglist method
   * @return bookingId
  **/
  @ApiModelProperty(value = "Service booking id, as provided by the getroominglist method")
  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public ServiceConfirmation confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * True if this service is OK. False if this service is not accepted
   * @return confirmed
  **/
  @ApiModelProperty(value = "True if this service is OK. False if this service is not accepted")
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public ServiceConfirmation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments you want to supply. E.g. the reason to reject the service request
   * @return comments
  **/
  @ApiModelProperty(value = "Comments you want to supply. E.g. the reason to reject the service request")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceConfirmation serviceConfirmation = (ServiceConfirmation) o;
    return Objects.equals(this.bookingId, serviceConfirmation.bookingId) &&
        Objects.equals(this.confirmed, serviceConfirmation.confirmed) &&
        Objects.equals(this.comments, serviceConfirmation.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, confirmed, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceConfirmation {\n");
    
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

