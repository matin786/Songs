package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class icrQty {
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
@Id

private int id;
private int qty;

	
}
