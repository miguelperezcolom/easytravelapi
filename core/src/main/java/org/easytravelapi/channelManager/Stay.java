package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A stay line inside a hotel booking service")
public class Stay {

    @ApiModelProperty(value = "When this stay starts in locale. In YYYYMMDD format")
    private int start;
    @ApiModelProperty(value = "When this stay ends in locale. In YYYYMMDD format")
    private int end;

    @ApiModelProperty(value = "The room id")
    private String roomId;
    @ApiModelProperty(value = "The room name")
    private String roomName;

    @ApiModelProperty(value = "The board basis id")
    private String boardBasisId;
    @ApiModelProperty(value = "The board basis name")
    private String boardBasisName;

    @ApiModelProperty(value = "The number of rooms for this line")
    private int numberOfRooms;
    @ApiModelProperty(value = "How many pax will stay per room for this line")
    private int paxPerRoom;
    @ApiModelProperty(value = "Ages for the pax. If ommited pax will be assumed to be an adult")
    private int[] ages;


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getBoardBasisId() {
        return boardBasisId;
    }

    public void setBoardBasisId(String boardBasisId) {
        this.boardBasisId = boardBasisId;
    }

    public String getBoardBasisName() {
        return boardBasisName;
    }

    public void setBoardBasisName(String boardBasisName) {
        this.boardBasisName = boardBasisName;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPaxPerRoom() {
        return paxPerRoom;
    }

    public void setPaxPerRoom(int paxPerRoom) {
        this.paxPerRoom = paxPerRoom;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }
}
