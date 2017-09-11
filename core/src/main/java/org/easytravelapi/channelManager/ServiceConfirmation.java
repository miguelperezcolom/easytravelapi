package org.easytravelapi.channelManager;

/**
 * Created by miguel on 26/7/17.
 */
public class ServiceConfirmation {

    private String bookingId;
    private boolean confirmed;
    private String comments;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
