package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Return {

	@Id
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, rQty> map=new HashMap<>();
	private String date;
	private String invoiceno;
	private String returnstatus;
	private float returnamount;
	private String returnby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, rQty> getMap() {
		return map;
	}
	public void setMap(Map<String, rQty> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getReturnstatus() {
		return returnstatus;
	}
	public void setReturnstatus(String returnstatus) {
		this.returnstatus = returnstatus;
	}
	public float getReturnamount() {
		return returnamount;
	}
	public void setReturnamount(float returnamount) {
		this.returnamount = returnamount;
	}
	public String getReturnby() {
		return returnby;
	}
	public void setReturnby(String returnby) {
		this.returnby = returnby;
	}
	
	
}
