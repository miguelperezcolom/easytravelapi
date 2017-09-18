package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Container for the getdatasheet response
 */
@ApiModel(description = "Container for the getdatasheet response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GetDataSheetRS {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("systemTime")
  private String systemTime = null;

  @SerializedName("values")
  private List<Pair> values = new ArrayList<Pair>();

  public GetDataSheetRS statusCode(Integer statusCode) {
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

  public GetDataSheetRS msg(String msg) {
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

  public GetDataSheetRS systemTime(String systemTime) {
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

  public GetDataSheetRS values(List<Pair> values) {
    this.values = values;
    return this;
  }

  public GetDataSheetRS addValuesItem(Pair valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * List of data associated with this resource, in a flatten manner
   * @return values
  **/
  @ApiModelProperty(value = "List of data associated with this resource, in a flatten manner")
  public List<Pair> getValues() {
    return values;
  }

  public void setValues(List<Pair> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataSheetRS getDataSheetRS = (GetDataSheetRS) o;
    return Objects.equals(this.statusCode, getDataSheetRS.statusCode) &&
        Objects.equals(this.msg, getDataSheetRS.msg) &&
        Objects.equals(this.systemTime, getDataSheetRS.systemTime) &&
        Objects.equals(this.values, getDataSheetRS.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msg, systemTime, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataSheetRS {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

