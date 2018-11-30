package org.easytravelapi.common;

public class GetLocatorRS extends AbstractRS {

    private String leadName;
    private String email;
    private String destination;
    private String destinationName;
    private int checkin;
    private int checkout;
    private String occupation;
    private int pax;
    private String origen;
    private  String origenName;




    public String getLeadName() { return leadName; }

    public void setLeadName(String leadName) { this.leadName = leadName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDestination() { return destination; }

    public void setDestination(String destination) { this.destination = destination; }

    public int getCheckin() { return checkin; }

    public void setCheckin(int checkin) { this.checkin = checkin; }

    public int getCheckout() { return checkout; }

    public void setCheckout(int checkout) { this.checkout = checkout; }

    public String getOccupation() { return occupation; }

    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getDestinationName() { return destinationName; }

    public void setDestinationName(String destinationName) { this.destinationName = destinationName; }

    public int getPax() { return pax; }

    public void setPax(int pax) { this.pax = pax; }

    public String getOrigen() { return origen; }

    public void setOrigen(String origen) { this.origen = origen; }

    public String getOrigenName() { return origenName; }

    public void setOrigenName(String origenName) { this.origenName = origenName; }


}
