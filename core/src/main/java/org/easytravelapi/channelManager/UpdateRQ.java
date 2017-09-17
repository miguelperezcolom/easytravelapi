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
@ApiModel(description = "Container for the update request parameters")
public class UpdateRQ {

    @ApiModelProperty(value = "List of operations you want to perform on hote inventories")
    private List<UpdateOperation> operations = new ArrayList<UpdateOperation>();


    public static UpdateRQ fromString(String json) {
        return Helper.fromString(UpdateRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public List<UpdateOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<UpdateOperation> operations) {
        this.operations = operations;
    }
}
