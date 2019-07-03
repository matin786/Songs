package com.cjc.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProductPriceMapping  implements Serializable{

	@Id
	
	@OneToOne(cascade=CascadeType.ALL)
	private Product product;
	private float purchasedprice;
	private float taxgroup;
	private float sellingprice;
	@OneToOne(cascade=CascadeType.ALL)
	private Supplier supplier;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public float getPurchasedprice() {
		return purchasedprice;
	}
	public void setPurchasedprice(float purchasedprice) {
		this.purchasedprice = purchasedprice;
	}
	public float getTaxgroup() {
		return taxgroup;
	}
	public void setTaxgroup(float taxgroup) {
		this.taxgroup = taxgroup;
	}
	public float getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(float sellingprice) {
		this.sellingprice = sellingprice;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

}
