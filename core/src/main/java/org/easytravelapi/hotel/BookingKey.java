package org.easytravelapi.hotel;

import java.util.List;

public class BookingKey {
    private List<PaxDetails> occupancy;
    private int roomId;
    private String rateKey;

    public List<PaxDetails> getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(List<PaxDetails> occupancy) {
        this.occupancy = occupancy;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }
}
