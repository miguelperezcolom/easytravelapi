package org.easytravelapi.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
public abstract class AbstractAuthenticatedRQ extends AbstractRQ {

    @ApiModelProperty(value = "Your id. As provided")
    private String agentId;
    @ApiModelProperty(value = "Your user name. As provided")
    private String userName;
    @ApiModelProperty(value = "Your password. As provided")
    private String password;

    @ApiModelProperty(value = "The language iso code you want descriptions (when available. E.g. room names, hotel descriptions, ...) to be returned in")
    private String languageIsoCode;


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguageIsoCode() {
        return languageIsoCode;
    }

    public void setLanguageIsoCode(String languageIsoCode) {
        this.languageIsoCode = languageIsoCode;
    }
}
