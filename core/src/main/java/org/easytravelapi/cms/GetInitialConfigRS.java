package org.easytravelapi.cms;

import org.easytravelapi.common.AbstractRS;

public class GetInitialConfigRS  extends AbstractRS {

    private String contactEmail;

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
