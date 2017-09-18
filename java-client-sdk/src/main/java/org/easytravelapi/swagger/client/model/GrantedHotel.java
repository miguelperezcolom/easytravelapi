package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains hotel information like rooms ids, etc
 */
@ApiModel(description = "Contains hotel information like rooms ids, etc")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class GrantedHotel {
  @SerializedName("hotelId")
  private String hotelId = null;

  @SerializedName("hotelName")
  private String hotelName = null;

  @SerializedName("roomIds")
  private List<RoomId> roomIds = new ArrayList<RoomId>();

  public GrantedHotel hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * Thid hotel id
   * @return hotelId
  **/
  @ApiModelProperty(value = "Thid hotel id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public GrantedHotel hotelName(String hotelName) {
    this.hotelName = hotelName;
    return this;
  }

   /**
   * This hotel name
   * @return hotelName
  **/
  @ApiModelProperty(value = "This hotel name")
  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public GrantedHotel roomIds(List<RoomId> roomIds) {
    this.roomIds = roomIds;
    return this;
  }

  public GrantedHotel addRoomIdsItem(RoomId roomIdsItem) {
    this.roomIds.add(roomIdsItem);
    return this;
  }

   /**
   * List of room ids valid for this hotel
   * @return roomIds
  **/
  @ApiModelProperty(value = "List of room ids valid for this hotel")
  public List<RoomId> getRoomIds() {
    return roomIds;
  }

  public void setRoomIds(List<RoomId> roomIds) {
    this.roomIds = roomIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantedHotel grantedHotel = (GrantedHotel) o;
    return Objects.equals(this.hotelId, grantedHotel.hotelId) &&
        Objects.equals(this.hotelName, grantedHotel.hotelName) &&
        Objects.equals(this.roomIds, grantedHotel.roomIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, hotelName, roomIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantedHotel {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelName: ").append(toIndentedString(hotelName)).append("\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
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

