package com.example.SpringH2.service;

import java.util.List;

import com.example.SpringH2.entity.Country;

public interface CountryService {

	Country saveCountry(Country country);
	
	List<Country> getCountries();
	
	Country updateCountry(Country country, Long countryId);
	
	void deleteCountry(Long countryId);
}
