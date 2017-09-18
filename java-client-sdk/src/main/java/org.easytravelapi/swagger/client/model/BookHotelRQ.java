package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container for the hotel booking confirmation request
 */
@ApiModel(description = "Container for the hotel booking confirmation request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class BookHotelRQ {
  @SerializedName("key")
  private String key = null;

  @SerializedName("bookingReference")
  private String bookingReference = null;

  @SerializedName("leadName")
  private String leadName = null;

  @SerializedName("commentsToProvider")
  private String commentsToProvider = null;

  @SerializedName("privateComments")
  private String privateComments = null;

  public BookHotelRQ key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The price id, as we got it when we asked for available hotels
   * @return key
  **/
  @ApiModelProperty(value = "The price id, as we got it when we asked for available hotels")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BookHotelRQ bookingReference(String bookingReference) {
    this.bookingReference = bookingReference;
    return this;
  }

   /**
   * A free text reference you want to appear in the final invoice, so you can match it when validating our invoices
   * @return bookingReference
  **/
  @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
  public String getBookingReference() {
    return bookingReference;
  }

  public void setBookingReference(String bookingReference) {
    this.bookingReference = bookingReference;
  }

  public BookHotelRQ leadName(String leadName) {
    this.leadName = leadName;
    return this;
  }

   /**
   * The lead name
   * @return leadName
  **/
  @ApiModelProperty(value = "The lead name")
  public String getLeadName() {
    return leadName;
  }

  public void setLeadName(String leadName) {
    this.leadName = leadName;
  }

  public BookHotelRQ commentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
    return this;
  }

   /**
   * Comments from the customer which should arrive to the activity provider
   * @return commentsToProvider
  **/
  @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
  public String getCommentsToProvider() {
    return commentsToProvider;
  }

  public void setCommentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
  }

  public BookHotelRQ privateComments(String privateComments) {
    this.privateComments = privateComments;
    return this;
  }

   /**
   * Your comments for us. They will not be visible to the customer neither to the activity provider
   * @return privateComments
  **/
  @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
  public String getPrivateComments() {
    return privateComments;
  }

  public void setPrivateComments(String privateComments) {
    this.privateComments = privateComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookHotelRQ bookHotelRQ = (BookHotelRQ) o;
    return Objects.equals(this.key, bookHotelRQ.key) &&
        Objects.equals(this.bookingReference, bookHotelRQ.bookingReference) &&
        Objects.equals(this.leadName, bookHotelRQ.leadName) &&
        Objects.equals(this.commentsToProvider, bookHotelRQ.commentsToProvider) &&
        Objects.equals(this.privateComments, bookHotelRQ.privateComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, bookingReference, leadName, commentsToProvider, privateComments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookHotelRQ {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    bookingReference: ").append(toIndentedString(bookingReference)).append("\n");
    sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
    sb.append("    commentsToProvider: ").append(toIndentedString(commentsToProvider)).append("\n");
    sb.append("    privateComments: ").append(toIndentedString(privateComments)).append("\n");
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

