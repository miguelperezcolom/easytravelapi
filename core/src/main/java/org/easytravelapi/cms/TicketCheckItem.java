package org.easytravelapi.cms;

public class TicketCheckItem {

    private String id;
    private String qrcode;
    private String leadname;
    private int pax;
    private int checkedDate;
    private int checkedTime;
    private boolean checked;
    private String comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(int checkedDate) {
        this.checkedDate = checkedDate;
    }

    public int getCheckedTime() {
        return checkedTime;
    }

    public void setCheckedTime(int checkedTime) {
        this.checkedTime = checkedTime;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getLeadname() {
        return leadname;
    }

    public void setLeadname(String leadname) {
        this.leadname = leadname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
