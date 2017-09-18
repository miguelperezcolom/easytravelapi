package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Response for the activity booking confirmation
 */
@ApiModel(description = "Response for the activity booking confirmation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class BookActivityRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("bookingId")
  private String bookingId = null;

  public BookActivityRS statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant
   * @return statusCode
  **/
  @ApiModelProperty(value = "status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public BookActivityRS msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * error message, if needed
   * @return msg
  **/
  @ApiModelProperty(value = "error message, if needed")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public BookActivityRS systemTime(String systemTime) {
    this.systemTime = systemTime;
    return this;
  }

   /**
   * System time in ISO8651 format. Useful for bug resolution
   * @return systemTime
  **/
  @ApiModelProperty(value = "System time in ISO8651 format. Useful for bug resolution")
  public String getSystemTime() {
    return systemTime;
  }

  public void setSystemTime(String systemTime) {
    this.systemTime = systemTime;
  }

  public BookActivityRS bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

   /**
   * The resultant booking id. You will use it to later cancel the service, if you need to
   * @return bookingId
  **/
  @ApiModelProperty(value = "The resultant booking id. You will use it to later cancel the service, if you need to")
  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookActivityRS bookActivityRS = (BookActivityRS) o;
    return Objects.equals(this.statusCode, bookActivityRS.statusCode) &&
        Objects.equals(this.msg, bookActivityRS.msg) &&
        Objects.equals(this.systemTime, bookActivityRS.systemTime) &&
        Objects.equals(this.bookingId, bookActivityRS.bookingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, bookingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookActivityRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
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

