package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the hotel booking confirmation response")
public class BookHotelRS extends AbstractRS {

    @ApiModelProperty(value = "The booking id")
    private String bookingId;
    private String fileId;
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

    public List<String> getAvailableServices() { return availableServices; }

    public void setAvailableServices(List<String> availableServices) { this.availableServices = availableServices; }

    public String getPaymentUrl() { return paymentUrl; }

    public void setPaymentUrl(String paymentUrl) { this.paymentUrl = paymentUrl; }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
