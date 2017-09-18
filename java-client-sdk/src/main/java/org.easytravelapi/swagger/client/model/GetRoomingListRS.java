package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.HotelBooking;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for the getroominglist response
 */
@ApiModel(description = "Container for the getroominglist response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GetRoomingListRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("bookings")
  private List<HotelBooking> bookings = new ArrayList<HotelBooking>();

  public GetRoomingListRS statusCode(Integer statusCode) {
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

  public GetRoomingListRS msg(String msg) {
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

  public GetRoomingListRS systemTime(String systemTime) {
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

  public GetRoomingListRS bookings(List<HotelBooking> bookings) {
    this.bookings = bookings;
    return this;
  }

  public GetRoomingListRS addBookingsItem(HotelBooking bookingsItem) {
    this.bookings.add(bookingsItem);
    return this;
  }

   /**
   * List of hotel bookings
   * @return bookings
  **/
  @ApiModelProperty(value = "List of hotel bookings")
  public List<HotelBooking> getBookings() {
    return bookings;
  }

  public void setBookings(List<HotelBooking> bookings) {
    this.bookings = bookings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoomingListRS getRoomingListRS = (GetRoomingListRS) o;
    return Objects.equals(this.statusCode, getRoomingListRS.statusCode) &&
        Objects.equals(this.msg, getRoomingListRS.msg) &&
        Objects.equals(this.systemTime, getRoomingListRS.systemTime) &&
        Objects.equals(this.bookings, getRoomingListRS.bookings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, bookings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoomingListRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    bookings: ").append(toIndentedString(bookings)).append("\n");
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

