package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class rQty {

	@Id
	private int id;
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
	private int qty;
	
}
