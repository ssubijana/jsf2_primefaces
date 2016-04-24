package com.autentia.jsf2;

import java.io.*;
import java.text.*;
import java.util.*;

import javax.annotation.*;
import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.context.*;

@ManagedBean
@SessionScoped
public class Bean implements Serializable {

	private static final long serialVersionUID = -3948265000539992269L;

	private String userName;

	private String userLastName;

	private String country;

	private String city;
	
	private String text;

	private Map<String, String> countries;

	private Map<String, String> cities;

	@ManagedProperty("#{msg}")
	private ResourceBundle messagesBundle;

	@ManagedProperty("#{countryService}")
	private CountryService countryService;

	@PostConstruct
	public void init() {
		countries = countryService.getCountries();
	}

	public void loadCities() {
		cities = countryService.getCitiesByCountry(country);

	}

	public void loadMessage() {
		final String baseMessage = messagesBundle.getString("notification.message");
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO",
				MessageFormat.format(baseMessage, country, city));
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}

	public void setMessagesBundle(ResourceBundle messagesBundle) {
		this.messagesBundle = messagesBundle;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

}
