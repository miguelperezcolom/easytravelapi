package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetOfflineCheckListRS extends AbstractRS {

    @ApiModelProperty(value = "List of available excursions, to check")
    private List<ActivityCheckItem> activity = new ArrayList<ActivityCheckItem>();

    @ApiModelProperty(value = "List of available events in an excursions, to check")
    private List<EventCheckItem> event = new ArrayList<EventCheckItem>();

    @ApiModelProperty(value = "List of available events in an excursions, to check")
    private List<TicketListItem> ticketList = new ArrayList<TicketListItem>();

    public List<ActivityCheckItem> getActivity() {
        return activity;
    }

    public void setActivity(List<ActivityCheckItem> activity) {
        this.activity = activity;
    }

    public List<EventCheckItem> getEvent() {
        return event;
    }

    public void setEvent(List<EventCheckItem> event) {
        this.event = event;
    }

    public List<TicketListItem> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<TicketListItem> ticketList) {
        this.ticketList = ticketList;
    }
}
