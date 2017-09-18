package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An occupied room and the available board basis
 */
@ApiModel(description = "An occupied room and the available board basis")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Allocation {
  @SerializedName("numberOfRooms")
  private Integer numberOfRooms = null;

  @SerializedName("paxPerRoom")
  private Integer paxPerRoom = null;

  @SerializedName("ages")
  private List<Integer> ages = new ArrayList<Integer>();

  @SerializedName("roomId")
  private String roomId = null;

  @SerializedName("roomName")
  private String roomName = null;

  @SerializedName("prices")
  private List<BoardPrice> prices = new ArrayList<BoardPrice>();

  public Allocation numberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
    return this;
  }

   /**
   * Number of rooms
   * @return numberOfRooms
  **/
  @ApiModelProperty(value = "Number of rooms")
  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public Allocation paxPerRoom(Integer paxPerRoom) {
    this.paxPerRoom = paxPerRoom;
    return this;
  }

   /**
   * Pax per room
   * @return paxPerRoom
  **/
  @ApiModelProperty(value = "Pax per room")
  public Integer getPaxPerRoom() {
    return paxPerRoom;
  }

  public void setPaxPerRoom(Integer paxPerRoom) {
    this.paxPerRoom = paxPerRoom;
  }

  public Allocation ages(List<Integer> ages) {
    this.ages = ages;
    return this;
  }

  public Allocation addAgesItem(Integer agesItem) {
    this.ages.add(agesItem);
    return this;
  }

   /**
   * Ages. If not present we will assume the pax is an adult
   * @return ages
  **/
  @ApiModelProperty(value = "Ages. If not present we will assume the pax is an adult")
  public List<Integer> getAges() {
    return ages;
  }

  public void setAges(List<Integer> ages) {
    this.ages = ages;
  }

  public Allocation roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * This room type id
   * @return roomId
  **/
  @ApiModelProperty(value = "This room type id")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public Allocation roomName(String roomName) {
    this.roomName = roomName;
    return this;
  }

   /**
   * This room type name
   * @return roomName
  **/
  @ApiModelProperty(value = "This room type name")
  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public Allocation prices(List<BoardPrice> prices) {
    this.prices = prices;
    return this;
  }

  public Allocation addPricesItem(BoardPrice pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * List of available board basis and prices for each board
   * @return prices
  **/
  @ApiModelProperty(value = "List of available board basis and prices for each board")
  public List<BoardPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<BoardPrice> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocation allocation = (Allocation) o;
    return Objects.equals(this.numberOfRooms, allocation.numberOfRooms) &&
        Objects.equals(this.paxPerRoom, allocation.paxPerRoom) &&
        Objects.equals(this.ages, allocation.ages) &&
        Objects.equals(this.roomId, allocation.roomId) &&
        Objects.equals(this.roomName, allocation.roomName) &&
        Objects.equals(this.prices, allocation.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRooms, paxPerRoom, ages, roomId, roomName, prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    paxPerRoom: ").append(toIndentedString(paxPerRoom)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

