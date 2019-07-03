package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PSQty {
@Id

private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQty() {
	return Qty;
}
public void setQty(int qty) {
	Qty = qty;
}
private int Qty;
}
