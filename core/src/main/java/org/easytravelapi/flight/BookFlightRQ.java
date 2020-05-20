package org.easytravelapi.flight;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.transfer.BookTransferRQ;
import org.easytravelapi.util.Helper;

public class BookFlightRQ {

    private String fileId;

    public String departureKey;

    public String returnKey;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
    private String privateComments;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;
    @ApiModelProperty(value = "User language")
    private String language;
    @ApiModelProperty(value = "Booking extras")
    private String supplements;
    @ApiModelProperty(value = "Booking promo code for discount")
    private String promoCode;

    private boolean mailingUnwanted;

    public static BookTransferRQ fromString(String json) {
        return Helper.fromString(BookTransferRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

}
