package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Response for the shopping cart booking confirmation")
public class BookCMSRS extends AbstractRS {

    @ApiModelProperty(value = "The resultant booking id. You will use it to later cancel the service, if you need to")
    private String bookingId;
    @ApiModelProperty(value = "Available services to upsale your booking")
    private List<String> availableServices  = new ArrayList<>();
    @ApiModelProperty(value = "Generated URL to pay")
    private String paymentUrl;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public List<String> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(List<String> availableServices) {
        this.availableServices = availableServices;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

}

