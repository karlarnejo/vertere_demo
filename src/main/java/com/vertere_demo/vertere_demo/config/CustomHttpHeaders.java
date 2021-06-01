package com.vertere_demo.vertere_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Configuration
public class CustomHttpHeaders {

	@Autowired
	private Environment env;
	
	public HttpHeaders createHttpHeaders()
	{		
	    String encodedAuth = env.getProperty("app.token");
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.add("Authorization", "Bearer " + encodedAuth);
	    return headers;
	}
}
