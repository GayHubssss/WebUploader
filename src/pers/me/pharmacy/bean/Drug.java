package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Drug implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String dno;

    private String dname;

    private String dclass;

    private String dstandard;

    private String dvender;

    private Date manufactureDate;

    private Date effectiveDate;

    private Float dbidd;

    private Float dprice;

    private String approveNo;

    private String countryNo;

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno == null ? null : dno.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDclass() {
        return dclass;
    }

    public void setDclass(String dclass) {
        this.dclass = dclass == null ? null : dclass.trim();
    }

    public String getDstandard() {
        return dstandard;
    }

    public void setDstandard(String dstandard) {
        this.dstandard = dstandard == null ? null : dstandard.trim();
    }

    public String getDvender() {
        return dvender;
    }

    public void setDvender(String dvender) {
        this.dvender = dvender == null ? null : dvender.trim();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Float getDbidd() {
        return dbidd;
    }

    public void setDbidd(Float dbidd) {
        this.dbidd = dbidd;
    }

    public Float getDprice() {
        return dprice;
    }

    public void setDprice(Float dprice) {
        this.dprice = dprice;
    }

    public String getApproveNo() {
        return approveNo;
    }

    public void setApproveNo(String approveNo) {
        this.approveNo = approveNo == null ? null : approveNo.trim();
    }

    public String getCountryNo() {
        return countryNo;
    }

    public void setCountryNo(String countryNo) {
        this.countryNo = countryNo == null ? null : countryNo.trim();
    }
}