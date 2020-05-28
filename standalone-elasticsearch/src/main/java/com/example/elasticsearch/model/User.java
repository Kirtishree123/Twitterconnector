package com.example.elasticsearch.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class User {
	
	
	
	private String userId;
	private String name;
	private String text;
	private String location;
	private Date creationDate = new Date();
	private Map<String, String> userSettings = new HashMap<>();
	
	
	
	
	

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Map<String, String> getUserSettings() {
		return userSettings;
	}
	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}

}