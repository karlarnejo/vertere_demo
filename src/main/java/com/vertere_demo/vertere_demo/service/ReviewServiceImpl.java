package com.vertere_demo.vertere_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vertere_demo.vertere_demo.config.CustomHttpHeaders;
import com.vertere_demo.vertere_demo.model.ReviewModel;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private CustomHttpHeaders customHttpHeaders;
	
	@Override
	public ReviewModel getReviews(String id) {
		// TODO Auto-generated method stub
		String uri = "https://api.yelp.com/v3/businesses/" + id + "/reviews";
	    RestTemplate restTemplate = new RestTemplate();
	    
        HttpHeaders headers = customHttpHeaders.createHttpHeaders();
        HttpEntity<Object> entity = new HttpEntity<Object>("parameters", headers);
        ResponseEntity<ReviewModel> response = restTemplate.exchange(uri, HttpMethod.GET, entity, ReviewModel.class);
        
        return response.getBody();
	}

}
