package org.easytravelapi.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
public abstract class AbstractRS {

    @ApiModelProperty(value = "status code for the operation. It will be 200 if it was OK and any other value if something went wrong. Provider dependant")
    private int statusCode;
    @ApiModelProperty(value = "error message, if needed")
    private String msg;
    @ApiModelProperty(value = "System time in ISO8651 format. Useful for bug resolution")
    private String systemTime;



    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }
}
