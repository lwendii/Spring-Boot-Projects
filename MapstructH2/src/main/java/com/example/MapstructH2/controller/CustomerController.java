package com.example.MapstructH2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MapstructH2.dto.CustomerDto;
import com.example.MapstructH2.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	private CustomerService service;
	
	public CustomerController(CustomerService service) {
		this.service = service;
	}
	
	@GetMapping()
	public List<CustomerDto> getAll() {
		return this.service.getAll();
	}
}
