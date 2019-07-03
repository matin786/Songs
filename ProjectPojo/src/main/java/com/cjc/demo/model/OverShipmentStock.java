package com.cjc.demo.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OverShipmentStock {
@Id

private int osid;

@OneToMany(cascade=CascadeType.ALL)
private Map<String, ospQty> map=new HashMap<>();

public int getOsid() {
	return osid;
}

public void setOsid(int osid) {
	this.osid = osid;
}

public Map<String, ospQty> getMap() {
	return map;
}

public void setMap(Map<String, ospQty> map) {
	this.map = map;
}

}
