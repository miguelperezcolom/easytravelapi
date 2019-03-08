package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class GetTicketCheckListRS {
    @ApiModelProperty(value = "List of available events in an excursions, to check")
    private List<TicketCheckItem> ticket = new ArrayList<TicketCheckItem>();
    private int totalTickets;
    private int checkedTickets;
    private int remainingTickets;
    private int totalPax;
    private int checkedPax;
    private int remainingPax;


    public List<TicketCheckItem> getTicket() {
        return ticket;
    }

    public void setTicket(List<TicketCheckItem> ticket) {
        this.ticket = ticket;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getCheckedTickets() {
        return checkedTickets;
    }

    public void setCheckedTickets(int checkedTickets) {
        this.checkedTickets = checkedTickets;
    }

    public int getRemainingTickets() {
        return remainingTickets;
    }

    public void setRemainingTickets(int remainingTickets) {
        this.remainingTickets = remainingTickets;
    }

    public int getTotalPax() {
        return totalPax;
    }

    public void setTotalPax(int totalPax) {
        this.totalPax = totalPax;
    }

    public int getCheckedPax() {
        return checkedPax;
    }

    public void setCheckedPax(int checkedPax) {
        this.checkedPax = checkedPax;
    }

    public int getRemainingPax() {
        return remainingPax;
    }

    public void setRemainingPax(int remainingPax) {
        this.remainingPax = remainingPax;
    }
}
