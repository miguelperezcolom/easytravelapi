package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Container for the service confirmation response
 */
@ApiModel(description = "Container for the service confirmation response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class ConfirmServicesRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  public ConfirmServicesRS statusCode(Integer statusCode) {
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

  public ConfirmServicesRS msg(String msg) {
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

  public ConfirmServicesRS systemTime(String systemTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmServicesRS confirmServicesRS = (ConfirmServicesRS) o;
    return Objects.equals(this.statusCode, confirmServicesRS.statusCode) &&
        Objects.equals(this.msg, confirmServicesRS.msg) &&
        Objects.equals(this.systemTime, confirmServicesRS.systemTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmServicesRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
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

