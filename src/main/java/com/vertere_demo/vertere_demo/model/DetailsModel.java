package com.vertere_demo.vertere_demo.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsModel {

	private String id;
	private String url;
	private String text;
	private int rating;

	@DateTimeFormat (pattern = "Yyyy-mm-dd HH:mm:ss")
    @JsonFormat (pattern = "Yyyy-mm-dd HH:mm:ss")
	private Date time_created;
	private UserDetails user;
	
	public Date getTime_created() {
		return time_created;
	}
	public void setTime_created(Date time_created) {
		this.time_created = time_created;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
