package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BreakageStock {
public int getBsid() {
		return bsid;
	}
	public void setBsid(int bsid) {
		this.bsid = bsid;
	}
	public Map<String, bsQty> getMap() {
		return map;
	}
	public void setMap(Map<String, bsQty> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
@Id

private int bsid;
@OneToMany(cascade=CascadeType.ALL)
private Map<String, bsQty> map=new HashMap<>();
private String date;
}
