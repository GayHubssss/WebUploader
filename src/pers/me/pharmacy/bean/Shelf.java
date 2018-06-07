package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Shelf implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String sdNo;

    private String sdPosition;

    public String getSdNo() {
        return sdNo;
    }

    public void setSdNo(String sdNo) {
        this.sdNo = sdNo == null ? null : sdNo.trim();
    }

    public String getSdPosition() {
        return sdPosition;
    }

    public void setSdPosition(String sdPosition) {
        this.sdPosition = sdPosition == null ? null : sdPosition.trim();
    }
}