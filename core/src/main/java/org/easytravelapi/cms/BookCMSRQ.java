package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class BookCMSRQ {
    Map<String,Object> bookings;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;

    @ApiModelProperty(value = "User language")
    private String language;
}
