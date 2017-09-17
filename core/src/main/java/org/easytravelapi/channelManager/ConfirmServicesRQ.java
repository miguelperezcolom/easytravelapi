package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the confirm services request")
public class ConfirmServicesRQ {

    @ApiModelProperty(value = "List of service confirmations (or rejections)")
    private List<ServiceConfirmation> serviceConfirmations = new ArrayList<ServiceConfirmation>();


    public static ConfirmServicesRQ fromString(String json) {
        return Helper.fromString(ConfirmServicesRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public List<ServiceConfirmation> getServiceConfirmations() {
        return serviceConfirmations;
    }

    public void setServiceConfirmations(List<ServiceConfirmation> serviceConfirmations) {
        this.serviceConfirmations = serviceConfirmations;
    }
}
