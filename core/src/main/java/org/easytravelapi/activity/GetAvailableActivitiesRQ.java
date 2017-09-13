package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Holder for the available activities request")
public class GetAvailableActivitiesRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "Holidays start date in YYYYMMDD format")
    private int start;
    @ApiModelProperty(value = "Holidays end date in YYYYMMDD format")
    private int end;

    @ApiModelProperty(value = "Resort ID. You can get it from commons/getportfolio")
    private String resourceId;

    @ApiModelProperty(value = "Number of pax")
    private int pax;
    @ApiModelProperty(value = "Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults")
    private int[] ages;

    public static GetAvailableActivitiesRQ fromString(String json) {
        return Helper.fromString(GetAvailableActivitiesRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }
}
