package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ledger {
@Id

private int id;
private String ledgername;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLedgername() {
	return ledgername;
}
public void setLedgername(String ledgername) {
	this.ledgername = ledgername;
}

	
}
