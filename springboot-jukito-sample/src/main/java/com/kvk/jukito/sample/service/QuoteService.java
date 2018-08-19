package com.kvk.jukito.sample.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.kvk.jukito.sample.dao.QuoteDAO;

@Singleton
public class QuoteService {

	private QuoteDAO quoteDAO;
	
	@Inject
	public QuoteService(QuoteDAO quoteDAO) {
		super();
		this.quoteDAO = quoteDAO;
	}

	public Float getRateQuote(String ccy) {
		return quoteDAO.getRateQuote(ccy);
	}
}
