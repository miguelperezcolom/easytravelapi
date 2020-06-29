package org.easytravelapi.agent;

public class ProductionCenter {

    private String id;

    private String name;

    private String hotelName;

    public ProductionCenter() {
    }

    public ProductionCenter(String id, String name, String hotelName) {
        this.id = id;
        this.name = name;
        this.hotelName = hotelName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
