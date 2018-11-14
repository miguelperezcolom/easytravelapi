package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Resource;

import java.util.ArrayList;
import java.util.List;

public class GetDestinationRS extends AbstractRS {

    @ApiModelProperty(value = "List of destination.")
    private List<Resource> destination = new ArrayList<Resource>();

    public List<Resource> getDestination() { return destination; }

    public void setDestination(List<Resource> destination) { this.destination = destination; }
}