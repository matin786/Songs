package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WastageStock {
@Id

private int wsid;
public int getWsid() {
	return wsid;
}
public void setWsid(int wsid) {
	this.wsid = wsid;
}
public Map<String, wsQty> getMap() {
	return map;
}
public void setMap(Map<String, wsQty> map) {
	this.map = map;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@OneToMany(cascade=CascadeType.ALL)
private Map<String, wsQty> map=new HashMap<>();
private String date;
}