package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.BestDeal;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Response with the list of available products")
public class GetAvailableGenericsRS extends AbstractRS {

    @ApiModelProperty(value = "List of the available products")
    private List<AvailableGeneric> availableGenerics = new ArrayList<AvailableGeneric>();

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public List<AvailableGeneric> getAvailableGenerics() { return availableGenerics; }

    public void setAvailableGenerics(List<AvailableGeneric> availableGenerics) { this.availableGenerics = availableGenerics; }
}
