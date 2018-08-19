package com.kvk.jukito.sample.dao;

import java.util.Optional;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.kvk.jukito.sample.entity.QuoteEntity;
import com.kvk.jukito.sample.repository.QuoteRepository;

@Singleton
public class QuoteDAO {
	
	private QuoteRepository quoteRepository;
	
	@Inject
	public QuoteDAO(QuoteRepository quoteRepository) {
		super();
		this.quoteRepository = quoteRepository;
	}

	public Float getRateQuote(String ccy) {
		Optional<QuoteEntity> quote = quoteRepository.findByCcy(ccy);
		return quote.get().getRate();
	}
}
