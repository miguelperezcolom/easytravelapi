package org.easytravelapi.channelManager;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetGrantedHotelsRS extends AbstractRS {

    private List<GrantedHotel> grantedHotels = new ArrayList<GrantedHotel>();


    public List<GrantedHotel> getGrantedHotels() {
        return grantedHotels;
    }

    public void setGrantedHotels(List<GrantedHotel> grantedHotels) {
        this.grantedHotels = grantedHotels;
    }
}
