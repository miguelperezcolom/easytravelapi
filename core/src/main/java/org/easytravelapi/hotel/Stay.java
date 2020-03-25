package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(value = "One instance for each occupancy (number of rooms - pax - ages)")
public class Stay {
    @ApiModelProperty(value = "List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format. E.g.: 2x4-10-6-2,1x2 means 2 rooms occupied by 4 pax where 3 of them are 10, 6 and 2 years old and 1 room occupied by 2 pax")
    private String occupancies;
    @ApiModelProperty(value = "Desired room id")
    private String roomId;
    @ApiModelProperty(value = "Desired board id")
    private String boardId;
    @ApiModelProperty(value = "Desired rate id")
    private String rateId;
    @ApiModelProperty(value = "Semicolon separated list of desired supplements in format id#qty;id#qty;id#qty")
    private String supplements;
    @ApiModelProperty(value = "Passengers info. Applies only when confirming")
    private List<PaxDetails> pax  = new ArrayList<>();

    public String getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(String occupancies) {
        this.occupancies = occupancies;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public List<PaxDetails> getPax() {
        return pax;
    }

    public void setPax(List<PaxDetails> pax) {
        this.pax = pax;
    }
}
