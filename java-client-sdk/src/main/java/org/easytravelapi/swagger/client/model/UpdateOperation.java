package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Describes an update operation, like modifying allotment, prices or stop sales
 */
@ApiModel(description = "Describes an update operation, like modifying allotment, prices or stop sales")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class UpdateOperation {
  @SerializedName("hotelId")
  private String hotelId = null;

  @SerializedName("roomId")
  private String roomId = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("startDate")
  private Integer startDate = null;

  @SerializedName("endDate")
  private Integer endDate = null;

  @SerializedName("newValue")
  private String newValue = null;

  public UpdateOperation hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * Hotel id you got when you called the getgrantedhotels method
   * @return hotelId
  **/
  @ApiModelProperty(value = "Hotel id you got when you called the getgrantedhotels method")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public UpdateOperation roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Room id you got when you called the getgrantedhotels method
   * @return roomId
  **/
  @ApiModelProperty(value = "Room id you got when you called the getgrantedhotels method")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public UpdateOperation action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action you want to perform. E.g. STOPSALES, OPENSALES, SETPRICE, SETALLOTMENT, ...
   * @return action
  **/
  @ApiModelProperty(value = "Action you want to perform. E.g. STOPSALES, OPENSALES, SETPRICE, SETALLOTMENT, ...")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public UpdateOperation startDate(Integer startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Locale date this data starts appliance. In format YYYMMDD
   * @return startDate
  **/
  @ApiModelProperty(value = "Locale date this data starts appliance. In format YYYMMDD")
  public Integer getStartDate() {
    return startDate;
  }

  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }

  public UpdateOperation endDate(Integer endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Locale date this data ends appliance. In format YYYMMDD
   * @return endDate
  **/
  @ApiModelProperty(value = "Locale date this data ends appliance. In format YYYMMDD")
  public Integer getEndDate() {
    return endDate;
  }

  public void setEndDate(Integer endDate) {
    this.endDate = endDate;
  }

  public UpdateOperation newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * New value to be set
   * @return newValue
  **/
  @ApiModelProperty(value = "New value to be set")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOperation updateOperation = (UpdateOperation) o;
    return Objects.equals(this.hotelId, updateOperation.hotelId) &&
        Objects.equals(this.roomId, updateOperation.roomId) &&
        Objects.equals(this.action, updateOperation.action) &&
        Objects.equals(this.startDate, updateOperation.startDate) &&
        Objects.equals(this.endDate, updateOperation.endDate) &&
        Objects.equals(this.newValue, updateOperation.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, roomId, action, startDate, endDate, newValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOperation {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

