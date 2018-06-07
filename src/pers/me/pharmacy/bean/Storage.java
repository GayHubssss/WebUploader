package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Storage implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Drug dno;

    private Integer dstorage;

    private Shelf sdNo;

    private Counters dcNo;

    private Integer dcStorage;

    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Shelf getSdNo() {
		return sdNo;
	}

	public void setSdNo(Shelf sdNo) {
		this.sdNo = sdNo;
	}

	public Counters getDcNo() {
		return dcNo;
	}

	public void setDcNo(Counters dcNo) {
		this.dcNo = dcNo;
	}

	public Integer getDstorage() {
        return dstorage;
    }

    public void setDstorage(Integer dstorage) {
        this.dstorage = dstorage;
    }

    public Integer getDcStorage() {
        return dcStorage;
    }

    public void setDcStorage(Integer dcStorage) {
        this.dcStorage = dcStorage;
    }
}