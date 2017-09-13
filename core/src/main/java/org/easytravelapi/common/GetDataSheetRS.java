package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getdatasheet response")
public class GetDataSheetRS extends AbstractRS {

    @ApiModelProperty(value = "List of data associated with this resource, in a flatten manner")
    private List<Pair> values = new ArrayList<Pair>();


    public List<Pair> getValues() {
        return values;
    }

    public void setValues(List<Pair> values) {
        this.values = values;
    }
}
