package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Sale implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String mno;

    private Drug dno;

    private Customer cno;

    private Date mdate;

    private Integer mquantity;

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno == null ? null : mno.trim();
    }

    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Customer getCno() {
		return cno;
	}

	public void setCno(Customer cno) {
		this.cno = cno;
	}

	public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public Integer getMquantity() {
        return mquantity;
    }

    public void setMquantity(Integer mquantity) {
        this.mquantity = mquantity;
    }
}