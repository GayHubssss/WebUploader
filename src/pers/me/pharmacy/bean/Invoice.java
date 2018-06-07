package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String ino;

    private Supplier sno;

    private Drug dno;

    private Integer iquantity;

    private Date idate;

    private String icondition;

    public String getIno() {
        return ino;
    }

    public void setIno(String ino) {
        this.ino = ino == null ? null : ino.trim();
    }

    public Supplier getSno() {
		return sno;
	}

	public void setSno(Supplier sno) {
		this.sno = sno;
	}

	public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Integer getIquantity() {
        return iquantity;
    }

    public void setIquantity(Integer iquantity) {
        this.iquantity = iquantity;
    }

    public Date getIdate() {
        return idate;
    }

    public void setIdate(Date idate) {
        this.idate = idate;
    }

    public String getIcondition() {
        return icondition;
    }

    public void setIcondition(String icondition) {
        this.icondition = icondition == null ? null : icondition.trim();
    }
}