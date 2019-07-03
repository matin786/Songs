package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refund {
@Id

private int id;
private float refundamount;
private String invoiceno;
private String date;
private String paymentType;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getRefundamount() {
	return refundamount;
}
public void setRefundamount(float refundamount) {
	this.refundamount = refundamount;
}
public String getInvoiceno() {
	return invoiceno;
}
public void setInvoiceno(String invoiceno) {
	this.invoiceno = invoiceno;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}


}
