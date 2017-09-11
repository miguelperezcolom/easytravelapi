package org.easytravelapi.hotel;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableHotelsRQ extends AbstractAuthenticatedRQ {

    private List<String> resorts = new ArrayList<String>();

    private int checkIn;
    private int checkout;

    private List<Occupancy> occupancies = new ArrayList<Occupancy>();

    private boolean includeStaticInfo;


    public static GetAvailableHotelsRQ fromString(String json) {
        return Helper.fromString(GetAvailableHotelsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public List<String> getResorts() {
        return resorts;
    }

    public void setResorts(List<String> resorts) {
        this.resorts = resorts;
    }

    public int getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public List<Occupancy> getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
    }

    public boolean isIncludeStaticInfo() {
        return includeStaticInfo;
    }

    public void setIncludeStaticInfo(boolean includeStaticInfo) {
        this.includeStaticInfo = includeStaticInfo;
    }
}
