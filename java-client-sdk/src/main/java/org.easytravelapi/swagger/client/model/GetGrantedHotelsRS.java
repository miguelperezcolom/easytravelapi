package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GrantedHotel;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for the getgrantedhotels response
 */
@ApiModel(description = "Container for the getgrantedhotels response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GetGrantedHotelsRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("grantedHotels")
  private List<GrantedHotel> grantedHotels = new ArrayList<GrantedHotel>();

  public GetGrantedHotelsRS statusCode(Integer statusCode) {
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

  public GetGrantedHotelsRS msg(String msg) {
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

  public GetGrantedHotelsRS systemTime(String systemTime) {
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

  public GetGrantedHotelsRS grantedHotels(List<GrantedHotel> grantedHotels) {
    this.grantedHotels = grantedHotels;
    return this;
  }

  public GetGrantedHotelsRS addGrantedHotelsItem(GrantedHotel grantedHotelsItem) {
    this.grantedHotels.add(grantedHotelsItem);
    return this;
  }

   /**
   * List of the granted hotels (and room ids, board basis ids, ...)
   * @return grantedHotels
  **/
  @ApiModelProperty(value = "List of the granted hotels (and room ids, board basis ids, ...)")
  public List<GrantedHotel> getGrantedHotels() {
    return grantedHotels;
  }

  public void setGrantedHotels(List<GrantedHotel> grantedHotels) {
    this.grantedHotels = grantedHotels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGrantedHotelsRS getGrantedHotelsRS = (GetGrantedHotelsRS) o;
    return Objects.equals(this.statusCode, getGrantedHotelsRS.statusCode) &&
        Objects.equals(this.msg, getGrantedHotelsRS.msg) &&
        Objects.equals(this.systemTime, getGrantedHotelsRS.systemTime) &&
        Objects.equals(this.grantedHotels, getGrantedHotelsRS.grantedHotels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, grantedHotels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGrantedHotelsRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    grantedHotels: ").append(toIndentedString(grantedHotels)).append("\n");
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

