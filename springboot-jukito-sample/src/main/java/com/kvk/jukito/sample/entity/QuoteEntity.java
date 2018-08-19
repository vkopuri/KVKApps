package com.kvk.jukito.sample.entity;

import javax.persistence.Entity;

@Entity
public class QuoteEntity {

	private Integer id;
	private String ccy;
	private Float rate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
}
