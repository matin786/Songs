package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class District {
@Id
    private int did;
	public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDistrictname() {
	return districtname;
}
public void setDistrictname(String districtname) {
	this.districtname = districtname;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}
	private String districtname;
	@OneToOne(cascade=CascadeType.ALL)
	private State state;
	
}
