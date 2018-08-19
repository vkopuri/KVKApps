package com.kvk.jukito.sample.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.stereotype.Component;

import com.kvk.jukito.sample.rest.api.QuoteApiService;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		//super();
		registerEndpoints();
	}
	
	private void registerEndpoints() {
		register(WadlResource.class);
        register(QuoteApiService.class);
	}

}
