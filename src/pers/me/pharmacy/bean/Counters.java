package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Counters implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String dcNo;

    private String dcPosition;

    public String getDcNo() {
        return dcNo;
    }

    public void setDcNo(String dcNo) {
        this.dcNo = dcNo == null ? null : dcNo.trim();
    }

    public String getDcPosition() {
        return dcPosition;
    }

    public void setDcPosition(String dcPosition) {
        this.dcPosition = dcPosition == null ? null : dcPosition.trim();
    }
}