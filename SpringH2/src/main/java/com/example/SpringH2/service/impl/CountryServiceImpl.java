package com.example.SpringH2.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.SpringH2.entity.Country;
import com.example.SpringH2.repository.CountryRepository;
import com.example.SpringH2.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	private CountryRepository repo;
	
	public CountryServiceImpl(CountryRepository repo) {
		this.repo = repo;
	}
	@Override
	public Country saveCountry(Country country) {
		return this.repo.save(country);
	}

	@Override
	public List<Country> getCountries() {
		return (List<Country>) this.repo.findAll();
	}

	@Override
	public Country updateCountry(Country country, Long countryId) {
		Country countryDb = this.repo.findById(countryId).get();
		if(Objects.nonNull(countryDb)) {
			countryDb.setName(country.getName());
		}
		return this.repo.save(countryDb); 
	}

	@Override
	public void deleteCountry(Long countryId) {
		this.repo.deleteById(countryId);
	}

}
