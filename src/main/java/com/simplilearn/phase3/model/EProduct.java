package com.simplilearn.phase3.model;

import java.math.BigDecimal;

public class EProduct {
	
	private long id;
	private String name;
	private BigDecimal price;
	
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
