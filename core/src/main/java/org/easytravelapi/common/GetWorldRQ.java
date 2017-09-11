package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel
public class GetWorldRQ extends AbstractAuthenticatedRQ {

    public static GetWorldRQ fromString(String json) {
        return Helper.fromString(GetWorldRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
