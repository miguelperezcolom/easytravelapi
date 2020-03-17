package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the cancelbooking request")
public class CancelFileRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The service file id you want to cancel")
    private String fileId;


    public static CancelFileRQ fromString(String json) {
        return Helper.fromString(CancelFileRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
