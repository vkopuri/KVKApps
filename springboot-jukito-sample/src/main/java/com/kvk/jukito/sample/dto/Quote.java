package com.kvk.jukito.sample.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quote {

	private String ccy;
	private Float rate;
	
	public Quote() {
		super();
	}
	
	public Quote(String ccy, Float rate) {
		super();
		this.ccy = ccy;
		this.rate = rate;
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

	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return super.toString();
	}
}
