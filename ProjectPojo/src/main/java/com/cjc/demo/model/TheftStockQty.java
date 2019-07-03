package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TheftStockQty {
@Id

private int tsid;
@OneToMany(cascade=CascadeType.ALL)
private Map<String, tsQty> map=new HashMap<>();
public int getTsid() {
	return tsid;
}
public void setTsid(int tsid) {
	this.tsid = tsid;
}
public Map<String, tsQty> getMap() {
	return map;
}
public void setMap(Map<String, tsQty> map) {
	this.map = map;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
private String date;
}