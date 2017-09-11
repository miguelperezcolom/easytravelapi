package org.easytravelapi.activity;

import org.easytravelapi.util.Helper;
import org.easytravelapi.common.AbstractAuthenticatedRQ;

/**
 * Created by miguel on 26/7/17.
 */
public class BookActivityRQ extends AbstractAuthenticatedRQ {

    private String key;

    private String leadName;

    private String commentsToProvider;
    private String privateComments;


    public static BookActivityRQ fromString(String json) {
        return Helper.fromString(BookActivityRQ.class, json);
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
}
