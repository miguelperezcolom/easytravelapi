package org.easytravelapi.cms;

import org.easytravelapi.common.AbstractRS;

public class GetTermsRS extends AbstractRS {
    private String terms;
    private String unmailing;

    public String getTerms() { return terms; }

    public void setTerms(String terms) { this.terms = terms; }

    public String getUnmailing() { return unmailing; }

    public void setUnmailing(String unmailing) { this.unmailing = unmailing; }
}
