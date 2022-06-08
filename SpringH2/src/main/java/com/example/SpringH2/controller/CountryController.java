package com.example.SpringH2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringH2.entity.Country;
import com.example.SpringH2.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	private CountryService service;
	
	public CountryController(CountryService service) {
		this.service = service;
	}
	
	@PostMapping()
	public Country saveCountry(@RequestBody Country country) {
		return this.service.saveCountry(country);
	}
	
	@GetMapping()
	public List<Country> getCountries() {
		return this.service.getCountries();
	}
	
	@PutMapping("/{id}")
	public Country updateCountry(@RequestBody Country country, @PathVariable("id") Long countryId) {
		return this.service.updateCountry(country, countryId);
	}
	
	@DeleteMapping("{id}")
	public String deleteCountry(@PathVariable("id") Long id) {
		this.service.deleteCountry(id);
		return "Deleted successfully";
	}
	
}
