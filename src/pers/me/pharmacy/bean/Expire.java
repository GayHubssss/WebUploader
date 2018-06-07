package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Expire implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String eno;

    private Drug dno;

    private Integer equantity;

    private String econdition;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno == null ? null : eno.trim();
    }

    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Integer getEquantity() {
        return equantity;
    }

    public void setEquantity(Integer equantity) {
        this.equantity = equantity;
    }

    public String getEcondition() {
        return econdition;
    }

    public void setEcondition(String econdition) {
        this.econdition = econdition == null ? null : econdition.trim();
    }
}