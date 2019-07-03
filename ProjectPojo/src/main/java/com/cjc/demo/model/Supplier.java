package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
@Id
	private int sid;
	private String scompanyname;
	private String saddress;
	private String date;
	@OneToOne(cascade=CascadeType.ALL)
	private District district;
	@OneToOne(cascade=CascadeType.ALL)
	private State state;
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getScompanyname() {
		return scompanyname;
	}
	public void setScompanyname(String scompanyname) {
		this.scompanyname = scompanyname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getGstn() {
		return gstn;
	}
	public void setGstn(String gstn) {
		this.gstn = gstn;
	}
	private String gstn;
	
}
