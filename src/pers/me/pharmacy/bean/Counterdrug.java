package pers.me.pharmacy.bean;

import java.io.Serializable;
import java.util.Date;

public class Counterdrug implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String cdNo;

    private Drug dno;

    private Integer dcNum;

    private Date dcDate;

    private String dcCondition;

    public String getCdNo() {
        return cdNo;
    }

    public void setCdNo(String cdNo) {
        this.cdNo = cdNo == null ? null : cdNo.trim();
    }

    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Integer getDcNum() {
        return dcNum;
    }

    public void setDcNum(Integer dcNum) {
        this.dcNum = dcNum;
    }

    public Date getDcDate() {
        return dcDate;
    }

    public void setDcDate(Date dcDate) {
        this.dcDate = dcDate;
    }

    public String getDcCondition() {
        return dcCondition;
    }

    public void setDcCondition(String dcCondition) {
        this.dcCondition = dcCondition == null ? null : dcCondition.trim();
    }
}