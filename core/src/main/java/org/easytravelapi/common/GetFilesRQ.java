package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the get files request")
public class GetFilesRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "Starting date you want service files confirmed from. In YYYYMMDD format")
    private int fromConfirmationDate;
    @ApiModelProperty(value = "Ending date you want service files confirmed to. In YYYYMMDD format")
    private int toConfirmationDate;

    @ApiModelProperty(value = "Starting date you want service files starting from. In YYYYMMDD format")
    private int fromStartDate;
    @ApiModelProperty(value = "Ending date you want service files starting from. In YYYYMMDD format")
    private int toStartDate;

    public static GetFilesRQ fromString(String json) {
        return Helper.fromString(GetFilesRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public int getFromConfirmationDate() {
        return fromConfirmationDate;
    }

    public void setFromConfirmationDate(int fromConfirmationDate) {
        this.fromConfirmationDate = fromConfirmationDate;
    }

    public int getToConfirmationDate() {
        return toConfirmationDate;
    }

    public void setToConfirmationDate(int toConfirmationDate) {
        this.toConfirmationDate = toConfirmationDate;
    }

    public int getFromStartDate() {
        return fromStartDate;
    }

    public void setFromStartDate(int fromStartDate) {
        this.fromStartDate = fromStartDate;
    }

    public int getToStartDate() {
        return toStartDate;
    }

    public void setToStartDate(int toStartDate) {
        this.toStartDate = toStartDate;
    }
}
