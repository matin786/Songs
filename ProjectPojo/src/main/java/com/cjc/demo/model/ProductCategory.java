package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
 

@Entity
public class ProductCategory {

	@Id
	private int cid;
	private String category;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
