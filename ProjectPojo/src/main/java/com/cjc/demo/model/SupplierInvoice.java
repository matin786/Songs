package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SupplierInvoice {
@Id

private int id;
private String suppliesInvoiceno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSuppliesInvoiceno() {
	return suppliesInvoiceno;
}
public void setSuppliesInvoiceno(String suppliesInvoiceno) {
	this.suppliesInvoiceno = suppliesInvoiceno;
}
}
