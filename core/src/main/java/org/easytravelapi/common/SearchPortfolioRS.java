package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the searchportfolio response")
public class SearchPortfolioRS extends AbstractRS {

    @ApiModelProperty(value = "List of matches")
    private List<Match> matches = new ArrayList<Match>();


    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
