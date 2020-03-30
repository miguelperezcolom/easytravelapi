package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModelProperty;

public class PaxDetails {
    @ApiModelProperty(value = "Passenger first name")
    private String firstName;
    @ApiModelProperty(value = "Passenger surname")
    private String surname;
    @ApiModelProperty(value = "Passenger age")
    private int age ;
    @ApiModelProperty(value = "Passenger type. Possible values are: AD for adult and CH for child")
    private String type;
    @ApiModelProperty(value = "E.g.: room number, vehicle, .... For presentation purposes only")
    private String groupId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public PaxDetails(String type, String groupId) {
        this.type = type;
        this.groupId = groupId;
    }

    public PaxDetails() {
    }

    public PaxDetails(String firstName, String surname, int age, String type, String groupId) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.type = type;
        this.groupId = groupId;
    }
}
