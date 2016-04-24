package com.autentia.jsf2;

import java.io.*;
import java.text.*;
import java.util.*;

import javax.annotation.*;
import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class Bean implements Serializable {

	private static final long serialVersionUID = -3948265000539992269L;

	private String userName;

	private String userLastName;

	private String country;

	private String city;

	private String message;

	private Map<String, String> countries;

	private Map<String, String> cities;

	private Map<String, Map<String, String>> availableCities;

	@ManagedProperty("#{msg}")
	private ResourceBundle messagesBundle;

	@PostConstruct
	public void init() {
		countries = new HashMap<>();
		countries.put("USA", "USA");
		countries.put("Germany", "Germany");
		countries.put("Brazil", "Brazil");
		countries.put("Spain", "Spain");

		availableCities = new HashMap<>();

		Map<String, String> map = new HashMap<>();
		map.put("New York", "New York");
		map.put("San Francisco", "San Francisco");
		map.put("Denver", "Denver");
		availableCities.put("USA", map);

		map = new HashMap<>();
		map.put("Berlin", "Berlin");
		map.put("Munich", "Munich");
		map.put("Frankfurt", "Frankfurt");
		availableCities.put("Germany", map);

		map = new HashMap<>();
		map.put("Sao Paolo", "Sao Paolo");
		map.put("Rio de Janerio", "Rio de Janerio");
		map.put("Salvador", "Salvador");
		availableCities.put("Brazil", map);

		map = new HashMap<>();
		map.put("Barcelona", "Barcelona");
		map.put("Madrid", "Madrid");
		map.put("Zaragoza", "Zaragoza");
		availableCities.put("Spain", map);

	}

	public void loadCities() {
		cities = availableCities.get(country);
	}

	public void loadMessage() {
		final String baseMessage = messagesBundle.getString("notification.message");
		message = MessageFormat.format(baseMessage, country, city);
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

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
