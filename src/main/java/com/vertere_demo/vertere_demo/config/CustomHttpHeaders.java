package com.vertere_demo.vertere_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Configuration
public class CustomHttpHeaders {

	public HttpHeaders createHttpHeaders()
	{
	    String encodedAuth = "-8VwLS2rc7WaNArbMQire4cnj1HPUyA7qk3IsGHViS8frazrrur8rgIVJCOuYGBcPfHM66rx0dMsYOrtqmT7_J0AVvzhHn-ZYzmTrn3NwGOYxlWBQTEGEatpRJe1YHYx";
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.add("Authorization", "Bearer " + encodedAuth);
	    return headers;
	}
}
