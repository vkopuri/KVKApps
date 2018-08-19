package com.kvk.jukito.sample.rest.api.test;


import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import com.google.inject.Inject;
import com.kvk.jukito.sample.dto.Quote;
import com.kvk.jukito.sample.entity.QuoteEntity;
import com.kvk.jukito.sample.repository.QuoteRepository;
import com.kvk.jukito.sample.rest.api.QuoteApiService;

@RunWith(JukitoRunner.class)
public class QuoteApiServiceTest {
	
	@Inject private QuoteApiService quoteApiService;
	@Inject @Mock private QuoteRepository quoteRepository;
	
	@Before
	public void setup() {
		QuoteEntity entity =  new QuoteEntity();
		entity.setCcy("INR");
		entity.setRate(Float.valueOf(69.15f));
		when(quoteRepository.findByCcy( any(String.class))).thenReturn(Optional.ofNullable(entity));
	}
	
	@Test
	public void getRateQuoteTest() {
		Quote quote = quoteApiService.getRateQuote("INR");
		System.out.println(quote);
	}
}
