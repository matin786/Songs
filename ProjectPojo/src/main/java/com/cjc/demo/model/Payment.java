package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
@Id

private int id;
private String paymentmode;
private String invoiceno;
private float paymentamount;
@OneToOne(cascade=CascadeType.ALL)
private Status paymentstatus;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public String getInvoiceno() {
	return invoiceno;
}
public void setInvoiceno(String invoiceno) {
	this.invoiceno = invoiceno;
}
public float getPaymentamount() {
	return paymentamount;
}
public void setPaymentamount(float paymentamount) {
	this.paymentamount = paymentamount;
}
public Status getPaymentstatus() {
	return paymentstatus;
}
public void setPaymentstatus(Status paymentstatus) {
	this.paymentstatus = paymentstatus;
}

	
}
