package org.easytravelapi.cms;

import org.easytravelapi.common.AbstractRS;

public class GetLoginRS extends AbstractRS {

    private boolean isLogged;
    private String authUser;
    private String message;

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
