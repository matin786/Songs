package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class IncorrectReceiving {
@Id

private int icrid;
public int getIcrid() {
	return icrid;
}
public void setIcrid(int icrid) {
	this.icrid = icrid;
}
public Map<String, icrQty> getMap() {
	return map;
}
public void setMap(Map<String, icrQty> map) {
	this.map = map;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@OneToMany(cascade=CascadeType.ALL)
private Map<String, icrQty> map=new HashMap<>();
private String date;
}
