package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Container for the getavailability response
 */
@ApiModel(description = "Container for the getavailability response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GetAvailableHotelsRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("hotels")
  private List<AvailableHotel> hotels = new ArrayList<AvailableHotel>();

  public GetAvailableHotelsRS statusCode(Integer statusCode) {
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

  public GetAvailableHotelsRS msg(String msg) {
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

  public GetAvailableHotelsRS systemTime(String systemTime) {
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

  public GetAvailableHotelsRS hotels(List<AvailableHotel> hotels) {
    this.hotels = hotels;
    return this;
  }

  public GetAvailableHotelsRS addHotelsItem(AvailableHotel hotelsItem) {
    this.hotels.add(hotelsItem);
    return this;
  }

   /**
   * List of available hotels, including prices
   * @return hotels
  **/
  @ApiModelProperty(value = "List of available hotels, including prices")
  public List<AvailableHotel> getHotels() {
    return hotels;
  }

  public void setHotels(List<AvailableHotel> hotels) {
    this.hotels = hotels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvailableHotelsRS getAvailableHotelsRS = (GetAvailableHotelsRS) o;
    return Objects.equals(this.statusCode, getAvailableHotelsRS.statusCode) &&
        Objects.equals(this.msg, getAvailableHotelsRS.msg) &&
        Objects.equals(this.systemTime, getAvailableHotelsRS.systemTime) &&
        Objects.equals(this.hotels, getAvailableHotelsRS.hotels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, hotels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvailableHotelsRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    hotels: ").append(toIndentedString(hotels)).append("\n");
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

