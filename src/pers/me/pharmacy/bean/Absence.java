package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Absence implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String lno;

    private Drug dno;

    private Integer lquantity;

    private Date ldade;

    private String lcondition;

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno == null ? null : lno.trim();
    }


    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Integer getLquantity() {
        return lquantity;
    }

    public void setLquantity(Integer lquantity) {
        this.lquantity = lquantity;
    }

    public Date getLdade() {
        return ldade;
    }

    public void setLdade(Date ldade) {
        this.ldade = ldade;
    }

    public String getLcondition() {
        return lcondition;
    }

    public void setLcondition(String lcondition) {
        this.lcondition = lcondition == null ? null : lcondition.trim();
    }
}