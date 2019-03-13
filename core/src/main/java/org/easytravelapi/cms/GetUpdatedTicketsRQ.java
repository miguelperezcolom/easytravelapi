package org.easytravelapi.cms;

import java.util.ArrayList;
import java.util.List;

public class GetUpdatedTicketsRQ {
    private String userId;

    private List<TicketCheckItem> tickets =  new ArrayList<TicketCheckItem>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<TicketCheckItem> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketCheckItem> tickets) {
        this.tickets = tickets;
    }
}
