package org.easytravelapi.flight;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetAvailableFlightsRS extends AbstractRS {

    private String currency;

    private List<FlightBestPrice> departureBestPrices = new ArrayList<>();

    private List<AvailableFlight> departureFlights = new ArrayList<>();

    private List<FlightBestPrice> returnBestPrices = new ArrayList<>();

    private List<AvailableFlight> returnFlights = new ArrayList<>();

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<FlightBestPrice> getDepartureBestPrices() {
        return departureBestPrices;
    }

    public void setDepartureBestPrices(List<FlightBestPrice> departureBestPrices) {
        this.departureBestPrices = departureBestPrices;
    }

    public List<FlightBestPrice> getReturnBestPrices() {
        return returnBestPrices;
    }

    public void setReturnBestPrices(List<FlightBestPrice> returnBestPrices) {
        this.returnBestPrices = returnBestPrices;
    }

    public List<AvailableFlight> getDepartureFlights() {
        return departureFlights;
    }

    public void setDepartureFlights(List<AvailableFlight> departureFlights) {
        this.departureFlights = departureFlights;
    }

    public List<AvailableFlight> getReturnFlights() {
        return returnFlights;
    }

    public void setReturnFlights(List<AvailableFlight> returnFlights) {
        this.returnFlights = returnFlights;
    }
}
