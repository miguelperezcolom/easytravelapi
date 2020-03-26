package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "holder for a price detail line")
public class PriceLine {

    @ApiModelProperty("Price line description")
    private String description;

    @ApiModelProperty("Price line total")
    private Amount total;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Amount getTotal() {
        return total;
    }

    public void setTotal(Amount total) {
        this.total = total;
    }
}
