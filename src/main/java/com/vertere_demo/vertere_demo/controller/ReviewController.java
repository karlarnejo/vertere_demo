package com.vertere_demo.vertere_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.vertere_demo.vertere_demo.config.CustomHttpHeaders;
import com.vertere_demo.vertere_demo.model.ReviewModel;
import com.vertere_demo.vertere_demo.service.ReviewService;

@RestController
@RequestMapping("/yelp")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping(value = "/reviews/{id}", method = RequestMethod.GET)
	public ReviewModel findAllFLName(@PathVariable String id) {		
		return reviewService.getReviews(id);
	}
}
