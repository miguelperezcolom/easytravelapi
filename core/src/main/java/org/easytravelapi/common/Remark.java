package org.easytravelapi.common;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A remoark is some important information which ")
public class Remark {

    //todo: revisar los tipos de remark posibles
    @ApiModelProperty(value = "Type of remark. Possible values are IMPORTANT, NORMAL")
    private String type;
    @ApiModelProperty(value = "Text which should be visible for the customer")
    private String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
