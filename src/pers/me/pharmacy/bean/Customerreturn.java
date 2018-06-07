package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Customerreturn implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String drNo;

    private Sale mno;

    private Date drDate;

    private Integer drrQuantity;

    private Integer draQuantity;

    private String drReason;

    public String getDrNo() {
        return drNo;
    }

    public void setDrNo(String drNo) {
        this.drNo = drNo == null ? null : drNo.trim();
    }

    public Sale getMno() {
		return mno;
	}

	public void setMno(Sale mno) {
		this.mno = mno;
	}

	public Date getDrDate() {
        return drDate;
    }

    public void setDrDate(Date drDate) {
        this.drDate = drDate;
    }

    public Integer getDrrQuantity() {
        return drrQuantity;
    }

    public void setDrrQuantity(Integer drrQuantity) {
        this.drrQuantity = drrQuantity;
    }

    public Integer getDraQuantity() {
        return draQuantity;
    }

    public void setDraQuantity(Integer draQuantity) {
        this.draQuantity = draQuantity;
    }

    public String getDrReason() {
        return drReason;
    }

    public void setDrReason(String drReason) {
        this.drReason = drReason == null ? null : drReason.trim();
    }
}