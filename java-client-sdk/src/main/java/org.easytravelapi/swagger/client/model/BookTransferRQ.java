package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container for the transfer service confirmation request
 */
@ApiModel(description = "Container for the transfer service confirmation request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class BookTransferRQ {
  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("languageIsoCode")
  private String languageIsoCode = null;

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

  @SerializedName("incomingFlightNumber")
  private String incomingFlightNumber = null;

  @SerializedName("incomingFlightTime")
  private Integer incomingFlightTime = null;

  @SerializedName("incomingFlightOrigin")
  private String incomingFlightOrigin = null;

  @SerializedName("outgoingFlightNumber")
  private String outgoingFlightNumber = null;

  @SerializedName("outgoingFlightTime")
  private Integer outgoingFlightTime = null;

  @SerializedName("outgoingFlightDestination")
  private String outgoingFlightDestination = null;

  public BookTransferRQ agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Your id. As provided
   * @return agentId
  **/
  @ApiModelProperty(value = "Your id. As provided")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public BookTransferRQ userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Your user name. As provided
   * @return userName
  **/
  @ApiModelProperty(value = "Your user name. As provided")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public BookTransferRQ password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your password. As provided
   * @return password
  **/
  @ApiModelProperty(value = "Your password. As provided")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public BookTransferRQ languageIsoCode(String languageIsoCode) {
    this.languageIsoCode = languageIsoCode;
    return this;
  }

   /**
   * The language iso code you want descriptions (when available. E.g. room names, hotel descriptions, ...) to be returned in
   * @return languageIsoCode
  **/
  @ApiModelProperty(value = "The language iso code you want descriptions (when available. E.g. room names, hotel descriptions, ...) to be returned in")
  public String getLanguageIsoCode() {
    return languageIsoCode;
  }

  public void setLanguageIsoCode(String languageIsoCode) {
    this.languageIsoCode = languageIsoCode;
  }

  public BookTransferRQ key(String key) {
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

  public BookTransferRQ bookingReference(String bookingReference) {
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

  public BookTransferRQ leadName(String leadName) {
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

  public BookTransferRQ commentsToProvider(String commentsToProvider) {
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

  public BookTransferRQ privateComments(String privateComments) {
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

  public BookTransferRQ incomingFlightNumber(String incomingFlightNumber) {
    this.incomingFlightNumber = incomingFlightNumber;
    return this;
  }

   /**
   * Incoming flight number
   * @return incomingFlightNumber
  **/
  @ApiModelProperty(value = "Incoming flight number")
  public String getIncomingFlightNumber() {
    return incomingFlightNumber;
  }

  public void setIncomingFlightNumber(String incomingFlightNumber) {
    this.incomingFlightNumber = incomingFlightNumber;
  }

  public BookTransferRQ incomingFlightTime(Integer incomingFlightTime) {
    this.incomingFlightTime = incomingFlightTime;
    return this;
  }

   /**
   * Locale incoming flight time in YYYYMMDDHHMM format
   * @return incomingFlightTime
  **/
  @ApiModelProperty(value = "Locale incoming flight time in YYYYMMDDHHMM format")
  public Integer getIncomingFlightTime() {
    return incomingFlightTime;
  }

  public void setIncomingFlightTime(Integer incomingFlightTime) {
    this.incomingFlightTime = incomingFlightTime;
  }

  public BookTransferRQ incomingFlightOrigin(String incomingFlightOrigin) {
    this.incomingFlightOrigin = incomingFlightOrigin;
    return this;
  }

   /**
   * Incoming flight origin
   * @return incomingFlightOrigin
  **/
  @ApiModelProperty(value = "Incoming flight origin")
  public String getIncomingFlightOrigin() {
    return incomingFlightOrigin;
  }

  public void setIncomingFlightOrigin(String incomingFlightOrigin) {
    this.incomingFlightOrigin = incomingFlightOrigin;
  }

  public BookTransferRQ outgoingFlightNumber(String outgoingFlightNumber) {
    this.outgoingFlightNumber = outgoingFlightNumber;
    return this;
  }

   /**
   * Outgoing flight number
   * @return outgoingFlightNumber
  **/
  @ApiModelProperty(value = "Outgoing flight number")
  public String getOutgoingFlightNumber() {
    return outgoingFlightNumber;
  }

  public void setOutgoingFlightNumber(String outgoingFlightNumber) {
    this.outgoingFlightNumber = outgoingFlightNumber;
  }

  public BookTransferRQ outgoingFlightTime(Integer outgoingFlightTime) {
    this.outgoingFlightTime = outgoingFlightTime;
    return this;
  }

   /**
   * Locale outgoing flight time in YYYYMMDDHHMM format
   * @return outgoingFlightTime
  **/
  @ApiModelProperty(value = "Locale outgoing flight time in YYYYMMDDHHMM format")
  public Integer getOutgoingFlightTime() {
    return outgoingFlightTime;
  }

  public void setOutgoingFlightTime(Integer outgoingFlightTime) {
    this.outgoingFlightTime = outgoingFlightTime;
  }

  public BookTransferRQ outgoingFlightDestination(String outgoingFlightDestination) {
    this.outgoingFlightDestination = outgoingFlightDestination;
    return this;
  }

   /**
   * Outgoing flight origin
   * @return outgoingFlightDestination
  **/
  @ApiModelProperty(value = "Outgoing flight origin")
  public String getOutgoingFlightDestination() {
    return outgoingFlightDestination;
  }

  public void setOutgoingFlightDestination(String outgoingFlightDestination) {
    this.outgoingFlightDestination = outgoingFlightDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookTransferRQ bookTransferRQ = (BookTransferRQ) o;
    return Objects.equals(this.agentId, bookTransferRQ.agentId) &&
        Objects.equals(this.userName, bookTransferRQ.userName) &&
        Objects.equals(this.password, bookTransferRQ.password) &&
        Objects.equals(this.languageIsoCode, bookTransferRQ.languageIsoCode) &&
        Objects.equals(this.key, bookTransferRQ.key) &&
        Objects.equals(this.bookingReference, bookTransferRQ.bookingReference) &&
        Objects.equals(this.leadName, bookTransferRQ.leadName) &&
        Objects.equals(this.commentsToProvider, bookTransferRQ.commentsToProvider) &&
        Objects.equals(this.privateComments, bookTransferRQ.privateComments) &&
        Objects.equals(this.incomingFlightNumber, bookTransferRQ.incomingFlightNumber) &&
        Objects.equals(this.incomingFlightTime, bookTransferRQ.incomingFlightTime) &&
        Objects.equals(this.incomingFlightOrigin, bookTransferRQ.incomingFlightOrigin) &&
        Objects.equals(this.outgoingFlightNumber, bookTransferRQ.outgoingFlightNumber) &&
        Objects.equals(this.outgoingFlightTime, bookTransferRQ.outgoingFlightTime) &&
        Objects.equals(this.outgoingFlightDestination, bookTransferRQ.outgoingFlightDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, userName, password, languageIsoCode, key, bookingReference, leadName, commentsToProvider, privateComments, incomingFlightNumber, incomingFlightTime, incomingFlightOrigin, outgoingFlightNumber, outgoingFlightTime, outgoingFlightDestination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookTransferRQ {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    languageIsoCode: ").append(toIndentedString(languageIsoCode)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    bookingReference: ").append(toIndentedString(bookingReference)).append("\n");
    sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
    sb.append("    commentsToProvider: ").append(toIndentedString(commentsToProvider)).append("\n");
    sb.append("    privateComments: ").append(toIndentedString(privateComments)).append("\n");
    sb.append("    incomingFlightNumber: ").append(toIndentedString(incomingFlightNumber)).append("\n");
    sb.append("    incomingFlightTime: ").append(toIndentedString(incomingFlightTime)).append("\n");
    sb.append("    incomingFlightOrigin: ").append(toIndentedString(incomingFlightOrigin)).append("\n");
    sb.append("    outgoingFlightNumber: ").append(toIndentedString(outgoingFlightNumber)).append("\n");
    sb.append("    outgoingFlightTime: ").append(toIndentedString(outgoingFlightTime)).append("\n");
    sb.append("    outgoingFlightDestination: ").append(toIndentedString(outgoingFlightDestination)).append("\n");
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

