package org.easytravelapi.channelManager;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class UpdateRQ extends AbstractAuthenticatedRQ {

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
