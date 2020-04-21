package org.easytravelapi.ingestion;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Transfer request")
public class TransferRQ {

    private String agencyId;
    private String agencyReference;

    private String currency;
    private double value;

    private String serviceType; //SHUTTLE, PRIVATE, EXECUTIVE, SHARED
    private String vehicle; //Si es un privado (taxi, minibus, etc)

    private String passengerName;
    private String phone;
    private String email;

    private int adults = 0;
    private int children = 0;
    private int babies = 0;
    private int extras = 0;
    private String comments;

    private String arrivalStatus; // OK, CANCELLED
    private String arrivalAirport;
    private String arrivalZone;
    private String arrivalAddress;

    private String arrivalFlightDate;//formato dd/MM/yyyy
    private String arrivalFlightTime;//formato HH:mm

    private String arrivalFlightNumber;
    private String arrivalFlightCompany;
    private String arrivalOriginAirport;
    private String arrivalComments;

    private String arrivalPickupDate;//formato dd/MM/yyyy
    private String arrivalPickupTime;//formato HH:mm

    private String departureStatus; // OK, CANCELLED
    private String departureAirport;
    private String departureZone;
    private String departureAddress;

    private String departureFlightDate;//formato dd/MM/yyyy
    private String departureFlightTime;//formato HH:mm

    private String departureFlightNumber;
    private String departureFlightCompany;
    private String departureDestinationAirport;
    private String departureComments;

    private String departurePickupDate; //formato dd/MM/yyyy
    private String departurePickupTime;//formato HH:mm

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyReference() {
        return agencyReference;
    }

    public void setAgencyReference(String agencyReference) {
        this.agencyReference = agencyReference;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int babies) {
        this.babies = babies;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getArrivalStatus() {
        return arrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(String arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public String getArrivalFlightDate() {
        return arrivalFlightDate;
    }

    public void setArrivalFlightDate(String arrivalFlightDate) {
        this.arrivalFlightDate = arrivalFlightDate;
    }

    public String getArrivalFlightTime() {
        return arrivalFlightTime;
    }

    public void setArrivalFlightTime(String arrivalFlightTime) {
        this.arrivalFlightTime = arrivalFlightTime;
    }

    public String getArrivalFlightNumber() {
        return arrivalFlightNumber;
    }

    public void setArrivalFlightNumber(String arrivalFlightNumber) {
        this.arrivalFlightNumber = arrivalFlightNumber;
    }

    public String getArrivalFlightCompany() {
        return arrivalFlightCompany;
    }

    public void setArrivalFlightCompany(String arrivalFlightCompany) {
        this.arrivalFlightCompany = arrivalFlightCompany;
    }

    public String getArrivalOriginAirport() {
        return arrivalOriginAirport;
    }

    public void setArrivalOriginAirport(String arrivalOriginAirport) {
        this.arrivalOriginAirport = arrivalOriginAirport;
    }

    public String getArrivalComments() {
        return arrivalComments;
    }

    public void setArrivalComments(String arrivalComments) {
        this.arrivalComments = arrivalComments;
    }

    public String getArrivalPickupDate() {
        return arrivalPickupDate;
    }

    public void setArrivalPickupDate(String arrivalPickupDate) {
        this.arrivalPickupDate = arrivalPickupDate;
    }

    public String getArrivalPickupTime() {
        return arrivalPickupTime;
    }

    public void setArrivalPickupTime(String arrivalPickupTime) {
        this.arrivalPickupTime = arrivalPickupTime;
    }

    public String getDepartureStatus() {
        return departureStatus;
    }

    public void setDepartureStatus(String departureStatus) {
        this.departureStatus = departureStatus;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureZone() {
        return departureZone;
    }

    public void setDepartureZone(String departureZone) {
        this.departureZone = departureZone;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public String getDepartureFlightDate() {
        return departureFlightDate;
    }

    public void setDepartureFlightDate(String departureFlightDate) {
        this.departureFlightDate = departureFlightDate;
    }

    public String getDepartureFlightTime() {
        return departureFlightTime;
    }

    public void setDepartureFlightTime(String departureFlightTime) {
        this.departureFlightTime = departureFlightTime;
    }

    public String getDepartureFlightNumber() {
        return departureFlightNumber;
    }

    public void setDepartureFlightNumber(String departureFlightNumber) {
        this.departureFlightNumber = departureFlightNumber;
    }

    public String getDepartureFlightCompany() {
        return departureFlightCompany;
    }

    public void setDepartureFlightCompany(String departureFlightCompany) {
        this.departureFlightCompany = departureFlightCompany;
    }

    public String getDepartureDestinationAirport() {
        return departureDestinationAirport;
    }

    public void setDepartureDestinationAirport(String departureDestinationAirport) {
        this.departureDestinationAirport = departureDestinationAirport;
    }

    public String getDepartureComments() {
        return departureComments;
    }

    public void setDepartureComments(String departureComments) {
        this.departureComments = departureComments;
    }

    public String getDeparturePickupDate() {
        return departurePickupDate;
    }

    public void setDeparturePickupDate(String departurePickupDate) {
        this.departurePickupDate = departurePickupDate;
    }

    public String getDeparturePickupTime() {
        return departurePickupTime;
    }

    public void setDeparturePickupTime(String departurePickupTime) {
        this.departurePickupTime = departurePickupTime;
    }
}
