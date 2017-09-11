package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public abstract class AbstractAuthenticatedRQ extends AbstractRQ {

    private String agentId;
    private String login;
    private String password;

    private String languageIsoCode;


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
