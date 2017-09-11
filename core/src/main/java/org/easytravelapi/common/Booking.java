package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public class Booking {

    private String bookingId;
    private String created;
    private String createdBy;
    private String modified;

    private String serviceType;
    private String serviceDescription;

    private String start;
    private String end;

    private String status;

    private String leadName;

    private Amount grossValue;
    private Amount netValue;
    private Amount commissionValue;

    private String commentsToProvider;
    private String privateComments;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public Amount getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(Amount grossValue) {
        this.grossValue = grossValue;
    }

    public Amount getNetValue() {
        return netValue;
    }

    public void setNetValue(Amount netValue) {
        this.netValue = netValue;
    }

    public Amount getCommissionValue() {
        return commissionValue;
    }

    public void setCommissionValue(Amount commissionValue) {
        this.commissionValue = commissionValue;
    }

    public String getCommentsToProvider() {
        return commentsToProvider;
    }

    public void setCommentsToProvider(String commentsToProvider) {
        this.commentsToProvider = commentsToProvider;
    }

    public String getPrivateComments() {
        return privateComments;
    }

    public void setPrivateComments(String privateComments) {
        this.privateComments = privateComments;
    }
}
