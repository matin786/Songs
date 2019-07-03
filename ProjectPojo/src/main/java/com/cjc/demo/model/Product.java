package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
@Id
	private int id;
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPhsncode() {
	return phsncode;
}
public void setPhsncode(String phsncode) {
	this.phsncode = phsncode;
}


public ProductCategory getPcat() {
	return pcat;
}
public void setPcat(ProductCategory pcat) {
	this.pcat = pcat;
}
public String getPbrand() {
	return pbrand;
}
public void setPbrand(String pbrand) {
	this.pbrand = pbrand;
}
	private String pname;
	private String phsncode;
	@OneToOne(cascade=CascadeType.ALL)
	private Product  ptype;
	@OneToOne(cascade=CascadeType.ALL)
	private ProductCategory pcat;
	private String pbrand;
	
	
}
