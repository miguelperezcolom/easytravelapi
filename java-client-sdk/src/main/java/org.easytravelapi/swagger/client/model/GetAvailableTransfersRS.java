package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AvailableTransfer;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for the getavailabletransfers response
 */
@ApiModel(description = "Container for the getavailabletransfers response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GetAvailableTransfersRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("availableTransfers")
  private List<AvailableTransfer> availableTransfers = new ArrayList<AvailableTransfer>();

  public GetAvailableTransfersRS statusCode(Integer statusCode) {
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

  public GetAvailableTransfersRS msg(String msg) {
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

  public GetAvailableTransfersRS systemTime(String systemTime) {
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

  public GetAvailableTransfersRS availableTransfers(List<AvailableTransfer> availableTransfers) {
    this.availableTransfers = availableTransfers;
    return this;
  }

  public GetAvailableTransfersRS addAvailableTransfersItem(AvailableTransfer availableTransfersItem) {
    this.availableTransfers.add(availableTransfersItem);
    return this;
  }

   /**
   * List of available transfers and their prices
   * @return availableTransfers
  **/
  @ApiModelProperty(value = "List of available transfers and their prices")
  public List<AvailableTransfer> getAvailableTransfers() {
    return availableTransfers;
  }

  public void setAvailableTransfers(List<AvailableTransfer> availableTransfers) {
    this.availableTransfers = availableTransfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvailableTransfersRS getAvailableTransfersRS = (GetAvailableTransfersRS) o;
    return Objects.equals(this.statusCode, getAvailableTransfersRS.statusCode) &&
        Objects.equals(this.msg, getAvailableTransfersRS.msg) &&
        Objects.equals(this.systemTime, getAvailableTransfersRS.systemTime) &&
        Objects.equals(this.availableTransfers, getAvailableTransfersRS.availableTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, availableTransfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvailableTransfersRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    availableTransfers: ").append(toIndentedString(availableTransfers)).append("\n");
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

