package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrder {

	@Id
	
	private int id;
	private String purchaseorderno;
	private String date;
	@OneToOne(cascade=CascadeType.ALL)
	private Supplier supplier;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, pQty> map=new HashMap<>();
	@OneToOne(cascade=CascadeType.ALL)
	private Status orderstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchaseorderno() {
		return purchaseorderno;
	}
	public void setPurchaseorderno(String purchaseorderno) {
		this.purchaseorderno = purchaseorderno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Map<String, pQty> getMap() {
		return map;
	}
	public void setMap(Map<String, pQty> map) {
		this.map = map;
	}
	public Status getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(Status orderstatus) {
		this.orderstatus = orderstatus;
	}
	
}
