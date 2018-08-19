package com.kvk.jukito.sample.rest.api;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

import com.google.inject.Inject;
import com.kvk.jukito.sample.dto.Quote;
import com.kvk.jukito.sample.service.QuoteService;

@Path("quotessvc")
@Component
public class QuoteApiService {

	private QuoteService quoteService;
	
	@Inject
	public QuoteApiService(QuoteService quoteService) {
		super();
		this.quoteService = quoteService;
	}

	@Path("{ccy}")
	public Quote getRateQuote(@PathParam("ccy") String ccy) {
		Float rate = quoteService.getRateQuote(ccy);
		return new Quote(ccy, rate);
	}
}
