package pers.me.pharmacy.bean;

import java.io.Serializable;

public class Damage implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String damageNo;

    private Drug dno;

    private Integer damageQuantity;

    private String damageCondition;

    private String damageDegree;

    public String getDamageNo() {
        return damageNo;
    }

    public void setDamageNo(String damageNo) {
        this.damageNo = damageNo == null ? null : damageNo.trim();
    }

    public Drug getDno() {
		return dno;
	}

	public void setDno(Drug dno) {
		this.dno = dno;
	}

	public Integer getDamageQuantity() {
        return damageQuantity;
    }

    public void setDamageQuantity(Integer damageQuantity) {
        this.damageQuantity = damageQuantity;
    }

    public String getDamageCondition() {
        return damageCondition;
    }

    public void setDamageCondition(String damageCondition) {
        this.damageCondition = damageCondition == null ? null : damageCondition.trim();
    }

    public String getDamageDegree() {
        return damageDegree;
    }

    public void setDamageDegree(String damageDegree) {
        this.damageDegree = damageDegree == null ? null : damageDegree.trim();
    }
}