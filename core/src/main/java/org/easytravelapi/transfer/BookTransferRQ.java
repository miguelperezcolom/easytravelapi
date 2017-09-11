package org.easytravelapi.transfer;

import org.easytravelapi.util.Helper;
import org.easytravelapi.common.AbstractAuthenticatedRQ;

/**
 * Created by miguel on 26/7/17.
 */
public class BookTransferRQ extends AbstractAuthenticatedRQ {

    private String key;

    private String leadName;

    private String commentsToProvider;
    private String privateComments;

    private String incomingFlightNumber;
    private int incomingFlightTime;
    private String incomingFlightOrigin;

    private String outgoingFlightNumber;
    private int outgoingFlightTime;
    private String outgoingFlightDestination;


    public static BookTransferRQ fromString(String json) {
        return Helper.fromString(BookTransferRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getCommentsToProvider() {
        return commentsToProvider;
    }

    public void setCommentsToProvider(String commentsToProvider) {
        this.commentsToProvider = commentsToProvider;
    }

    public String getPrivateComments() {
        return privateComments;
    }

    public void setPrivateComments(String privateComments) {
        this.privateComments = privateComments;
    }

    public String getIncomingFlightNumber() {
        return incomingFlightNumber;
    }

    public void setIncomingFlightNumber(String incomingFlightNumber) {
        this.incomingFlightNumber = incomingFlightNumber;
    }

    public int getIncomingFlightTime() {
        return incomingFlightTime;
    }

    public void setIncomingFlightTime(int incomingFlightTime) {
        this.incomingFlightTime = incomingFlightTime;
    }

    public String getIncomingFlightOrigin() {
        return incomingFlightOrigin;
    }

    public void setIncomingFlightOrigin(String incomingFlightOrigin) {
        this.incomingFlightOrigin = incomingFlightOrigin;
    }

    public String getOutgoingFlightNumber() {
        return outgoingFlightNumber;
    }

    public void setOutgoingFlightNumber(String outgoingFlightNumber) {
        this.outgoingFlightNumber = outgoingFlightNumber;
    }

    public int getOutgoingFlightTime() {
        return outgoingFlightTime;
    }

    public void setOutgoingFlightTime(int outgoingFlightTime) {
        this.outgoingFlightTime = outgoingFlightTime;
    }

    public String getOutgoingFlightDestination() {
        return outgoingFlightDestination;
    }

    public void setOutgoingFlightDestination(String outgoingFlightDestination) {
        this.outgoingFlightDestination = outgoingFlightDestination;
    }
}
