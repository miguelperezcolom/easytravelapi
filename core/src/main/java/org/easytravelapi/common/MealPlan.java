package org.easytravelapi.common;

import io.swagger.annotations.ApiModelProperty;

public class MealPlan {

    @ApiModelProperty(value = "The meal plan id")
    private String id;

    @ApiModelProperty(value = "The meal plan name")
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
