package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Returnt implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String rno;

    private Invoice ino;

    private Integer rquantity;

    private Date rdate;

    private String rcondition;

    private String rreason;

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno == null ? null : rno.trim();
    }

    public Invoice getIno() {
		return ino;
	}

	public void setIno(Invoice ino) {
		this.ino = ino;
	}

	public Integer getRquantity() {
        return rquantity;
    }

    public void setRquantity(Integer rquantity) {
        this.rquantity = rquantity;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getRcondition() {
        return rcondition;
    }

    public void setRcondition(String rcondition) {
        this.rcondition = rcondition == null ? null : rcondition.trim();
    }

    public String getRreason() {
        return rreason;
    }

    public void setRreason(String rreason) {
        this.rreason = rreason == null ? null : rreason.trim();
    }
}