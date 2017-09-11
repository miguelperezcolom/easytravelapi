package org.easytravelapi.channelManager;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetGrantedHotelsRQ extends AbstractAuthenticatedRQ {

    public static GetGrantedHotelsRQ fromString(String json) {
        return Helper.fromString(GetGrantedHotelsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
