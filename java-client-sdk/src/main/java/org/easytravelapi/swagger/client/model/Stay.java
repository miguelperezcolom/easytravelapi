package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A stay line inside a hotel booking service
 */
@ApiModel(description = "A stay line inside a hotel booking service")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Stay {
  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("roomId")
  private String roomId = null;

  @SerializedName("roomName")
  private String roomName = null;

  @SerializedName("boardBasisId")
  private String boardBasisId = null;

  @SerializedName("boardBasisName")
  private String boardBasisName = null;

  @SerializedName("numberOfRooms")
  private Integer numberOfRooms = null;

  @SerializedName("paxPerRoom")
  private Integer paxPerRoom = null;

  @SerializedName("ages")
  private List<Integer> ages = new ArrayList<Integer>();

  public Stay start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * When this stay starts in locale. In YYYYMMDD format
   * @return start
  **/
  @ApiModelProperty(value = "When this stay starts in locale. In YYYYMMDD format")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Stay end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * When this stay ends in locale. In YYYYMMDD format
   * @return end
  **/
  @ApiModelProperty(value = "When this stay ends in locale. In YYYYMMDD format")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public Stay roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * The room id
   * @return roomId
  **/
  @ApiModelProperty(value = "The room id")
  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public Stay roomName(String roomName) {
    this.roomName = roomName;
    return this;
  }

   /**
   * The room name
   * @return roomName
  **/
  @ApiModelProperty(value = "The room name")
  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public Stay boardBasisId(String boardBasisId) {
    this.boardBasisId = boardBasisId;
    return this;
  }

   /**
   * The board basis id
   * @return boardBasisId
  **/
  @ApiModelProperty(value = "The board basis id")
  public String getBoardBasisId() {
    return boardBasisId;
  }

  public void setBoardBasisId(String boardBasisId) {
    this.boardBasisId = boardBasisId;
  }

  public Stay boardBasisName(String boardBasisName) {
    this.boardBasisName = boardBasisName;
    return this;
  }

   /**
   * The board basis name
   * @return boardBasisName
  **/
  @ApiModelProperty(value = "The board basis name")
  public String getBoardBasisName() {
    return boardBasisName;
  }

  public void setBoardBasisName(String boardBasisName) {
    this.boardBasisName = boardBasisName;
  }

  public Stay numberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
    return this;
  }

   /**
   * The number of rooms for this line
   * @return numberOfRooms
  **/
  @ApiModelProperty(value = "The number of rooms for this line")
  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public Stay paxPerRoom(Integer paxPerRoom) {
    this.paxPerRoom = paxPerRoom;
    return this;
  }

   /**
   * How many pax will stay per room for this line
   * @return paxPerRoom
  **/
  @ApiModelProperty(value = "How many pax will stay per room for this line")
  public Integer getPaxPerRoom() {
    return paxPerRoom;
  }

  public void setPaxPerRoom(Integer paxPerRoom) {
    this.paxPerRoom = paxPerRoom;
  }

  public Stay ages(List<Integer> ages) {
    this.ages = ages;
    return this;
  }

  public Stay addAgesItem(Integer agesItem) {
    this.ages.add(agesItem);
    return this;
  }

   /**
   * Ages for the pax. If ommited pax will be assumed to be an adult
   * @return ages
  **/
  @ApiModelProperty(value = "Ages for the pax. If ommited pax will be assumed to be an adult")
  public List<Integer> getAges() {
    return ages;
  }

  public void setAges(List<Integer> ages) {
    this.ages = ages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stay stay = (Stay) o;
    return Objects.equals(this.start, stay.start) &&
        Objects.equals(this.end, stay.end) &&
        Objects.equals(this.roomId, stay.roomId) &&
        Objects.equals(this.roomName, stay.roomName) &&
        Objects.equals(this.boardBasisId, stay.boardBasisId) &&
        Objects.equals(this.boardBasisName, stay.boardBasisName) &&
        Objects.equals(this.numberOfRooms, stay.numberOfRooms) &&
        Objects.equals(this.paxPerRoom, stay.paxPerRoom) &&
        Objects.equals(this.ages, stay.ages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, roomId, roomName, boardBasisId, boardBasisName, numberOfRooms, paxPerRoom, ages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stay {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
    sb.append("    boardBasisId: ").append(toIndentedString(boardBasisId)).append("\n");
    sb.append("    boardBasisName: ").append(toIndentedString(boardBasisName)).append("\n");
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    paxPerRoom: ").append(toIndentedString(paxPerRoom)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
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

