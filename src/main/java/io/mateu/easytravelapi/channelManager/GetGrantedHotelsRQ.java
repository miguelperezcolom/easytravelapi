package io.mateu.easytravelapi.channelManager;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

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
