package org.easytravelapi.cms;

public class CheckTicketRS {
    private TicketCheckItem ticket;
    private boolean isValid;
    private String validationMessage;

    public TicketCheckItem getTicket() {
        return ticket;
    }

    public void setTicket(TicketCheckItem ticket) {
        this.ticket = ticket;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }
}
