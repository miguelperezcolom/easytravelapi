package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getgrantedhotels response")
public class GetGrantedHotelsRS extends AbstractRS {

    @ApiModelProperty(value = "List of the granted hotels (and room ids, board basis ids, ...)")
    private List<GrantedHotel> grantedHotels = new ArrayList<GrantedHotel>();


    public List<GrantedHotel> getGrantedHotels() {
        return grantedHotels;
    }

    public void setGrantedHotels(List<GrantedHotel> grantedHotels) {
        this.grantedHotels = grantedHotels;
    }
}
