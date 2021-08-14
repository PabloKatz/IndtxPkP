package com.Indtx.apirest.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity(name="prices")
@Table(name="prices")
public class Prices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Integer ID;
	
	@Column(name="BRAND_ID")
    private int BRAND_ID;

	//@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'GMT+2'")
	@Column(name="START_DATE")
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss a")
    private Date START_DATE ;

	//@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'GMT+2'")
    @Column(name="END_DATE")
    private Date END_DATE;

    @Column(name="PRICE_LIST")
    private int PRICE_LIST;

    @Column(name="PRODUCT_ID")
    private int PRODUCT_ID;
    
    @Column(name="PRIORITY")
    private int PRIORITY;
	
    @Column(name="PRICE")
    private BigDecimal PRICE;
    
    @Column(name="CURR")
    private String CURR;

    public Prices() {}

	public Prices(int bRAND_ID, Date sTART_DATE, Date eND_DATE, int pRICE_LIST, int pRODUCT_ID, int pRIORITY,
			BigDecimal pRICE, String cURR) {
		super();
		BRAND_ID = bRAND_ID;
		START_DATE = sTART_DATE;
		END_DATE = eND_DATE;
		PRICE_LIST = pRICE_LIST;
		PRODUCT_ID = pRODUCT_ID;
		PRIORITY = pRIORITY;
		PRICE = pRICE;
		CURR = cURR;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public int getBRAND_ID() {
		return BRAND_ID;
	}

	public void setBRAND_ID(int bRAND_ID) {
		BRAND_ID = bRAND_ID;
	}

	public Date getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	public Date getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}

	public int getPRICE_LIST() {
		return PRICE_LIST;
	}

	public void setPRICE_LIST(int pRICE_LIST) {
		PRICE_LIST = pRICE_LIST;
	}

	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public int getPRIORITY() {
		return PRIORITY;
	}

	public void setPRIORITY(int pRIORITY) {
		PRIORITY = pRIORITY;
	}

	public BigDecimal getPRICE() {
		return PRICE;
	}

	public void setPRICE(BigDecimal pRICE) {
		PRICE = pRICE;
	}

	public String getCURR() {
		return CURR;
	}

	public void setCURR(String cURR) {
		CURR = cURR;
	}

	
    
	
}