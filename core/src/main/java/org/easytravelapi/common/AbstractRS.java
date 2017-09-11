package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public abstract class AbstractRS {

    private int statusCode;
    private String msg;


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
}
