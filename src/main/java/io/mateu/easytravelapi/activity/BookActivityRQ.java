package io.mateu.easytravelapi.activity;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

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
}
