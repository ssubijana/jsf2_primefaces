package com.autentia.jsf2;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.*;

@Service
public class CountryService implements Serializable {

	private static final long serialVersionUID = -2289294066546931589L;

	private final Map<String, String> countries;

	{
		countries = new HashMap<String, String>();
		countries.put("USA", "USA");
		countries.put("Germany", "Germany");
		countries.put("Brazil", "Brazil");
		countries.put("Spain", "Spain");
	}

	private final Map<String, Map<String, String>> cities = new HashMap<String, Map<String, String>>();

	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("New York", "New York");
		map.put("San Francisco", "San Francisco");
		map.put("Denver", "Denver");
		cities.put("USA", map);

		map = new HashMap<String, String>();
		map.put("Berlin", "Berlin");
		map.put("Munich", "Munich");
		map.put("Frankfurt", "Frankfurt");
		cities.put("Germany", map);

		map = new HashMap<String, String>();
		map.put("Sao Paolo", "Sao Paolo");
		map.put("Rio de Janerio", "Rio de Janerio");
		map.put("Salvador", "Salvador");
		cities.put("Brazil", map);

		map = new HashMap<String, String>();
		map.put("Barcelona", "Barcelona");
		map.put("Madrid", "Madrid");
		map.put("Zaragoza", "Zaragoza");
		cities.put("Spain", map);
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public Map<String, String> getCitiesByCountry(final String country) {
		return cities.get(country);
	}
}
