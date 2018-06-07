package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Supplier implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String sno;

    private String sname;

    private String saddress;

    private String sphone;

    private String sinter;

    private String smail;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    public String getSinter() {
        return sinter;
    }

    public void setSinter(String sinter) {
        this.sinter = sinter == null ? null : sinter.trim();
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail == null ? null : smail.trim();
    }
}