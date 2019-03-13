package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetTicketCheckListRS extends AbstractRS {
    @ApiModelProperty(value = "List of available events in an excursions, to check")
    private TicketListItem ticket;

    public TicketListItem getTicket() {
        return ticket;
    }

    public void setTicket(TicketListItem ticket) {
        this.ticket = ticket;
    }
}
