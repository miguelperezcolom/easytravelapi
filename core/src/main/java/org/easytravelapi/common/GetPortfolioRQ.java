package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getportfolio request")
public class GetPortfolioRQ extends AbstractAuthenticatedRQ {

    public static GetPortfolioRQ fromString(String json) {
        return Helper.fromString(GetPortfolioRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
