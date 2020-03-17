package org.easytravelapi.common;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class File {

    @ApiModelProperty(value = "The File id")
    private String fileId;

    @ApiModelProperty(value = "File´s bookings list")
    private List<Booking> bookings  = new ArrayList<>();

    @ApiModelProperty(value = "The booking id")
    private Amount totalPrice;

    @ApiModelProperty(value = "This service lead name")
    private String leadName;

    @ApiModelProperty(value = "This service lead email")
    private String email;

    @ApiModelProperty(value = "When this service was created. In ISO8651 format")
    private String created;

    @ApiModelProperty(value = "Who created this service booking")
    private String createdBy;

    @ApiModelProperty(value = "Last modification date for this service in ISO8651 format")
    private String modified;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Amount getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Amount totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
