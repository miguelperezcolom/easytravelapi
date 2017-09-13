package org.easytravelapi.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
public class Booking {

    @ApiModelProperty(value = "The booking id")
    private String bookingId;
    @ApiModelProperty(value = "When this service was created. In ISO8651 format")
    private String created;
    @ApiModelProperty(value = "Who created this service booking")
    private String createdBy;
    @ApiModelProperty(value = "Last modification date for this service in ISO8651 format")
    private String modified;

    //todo: revisar si esto es correcto
    @ApiModelProperty(value = "Type of service. Intended to be HOTEL, TRANSFER, ACTIVITY, ...")
    private String serviceType;
    @ApiModelProperty(value = "Description of the service")
    private String serviceDescription;

    @ApiModelProperty(value = "When this service starts using locale. In YYYYMMDD format")
    private String start;
    @ApiModelProperty(value = "When this service ends using locale. In YYYYMMDD format")
    private String end;

    @ApiModelProperty(value = "Status for this service. E.g. OK, ONREQUEST, CANCELLED, ...")
    private String status;

    @ApiModelProperty(value = "This service lead name")
    private String leadName;

    @ApiModelProperty(value = "Price shown to the customer")
    private Amount retailValue;
    @ApiModelProperty(value = "Expected cost")
    private Amount netValue;
    @ApiModelProperty(value = "Our expected commission")
    private Amount commissionValue;

    @ApiModelProperty(value = "Comments from the customer")
    private String commentsToProvider;
    @ApiModelProperty(value = "Comments for you. Not to be shown to the customer")
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

    public Amount getRetailValue() {
        return retailValue;
    }

    public void setRetailValue(Amount retailValue) {
        this.retailValue = retailValue;
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
