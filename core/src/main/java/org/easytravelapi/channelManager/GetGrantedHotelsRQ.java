package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Holder for the getgrantedhotels request parameters. In fact, this request only needs the authentication data")
public class GetGrantedHotelsRQ extends AbstractAuthenticatedRQ {

    public static GetGrantedHotelsRQ fromString(String json) {
        return Helper.fromString(GetGrantedHotelsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
