package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getdatasheet request")
public class GetDataSheetRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The resource id, as we got it in the getportfolio method")
    private String resourceId;


    public static GetDataSheetRQ fromString(String json) {
        return Helper.fromString(GetDataSheetRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
