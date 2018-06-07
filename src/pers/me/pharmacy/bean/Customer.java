package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cno;

    private String cname;

    private String csex;

    private Integer cage;

    private String cphone;

    private String caddress;

    private String cclass;

    private String cidentify;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public Integer getCage() {
        return cage;
    }

    public void setCage(Integer cage) {
        this.cage = cage;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCclass() {
        return cclass;
    }

    public void setCclass(String cclass) {
        this.cclass = cclass == null ? null : cclass.trim();
    }

    public String getCidentify() {
        return cidentify;
    }

    public void setCidentify(String cidentify) {
        this.cidentify = cidentify == null ? null : cidentify.trim();
    }
}