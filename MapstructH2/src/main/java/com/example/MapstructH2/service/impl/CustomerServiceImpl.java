package com.example.MapstructH2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MapstructH2.dto.CustomerDto;
import com.example.MapstructH2.entity.Customer;
import com.example.MapstructH2.mapper.CustomerMapper;
import com.example.MapstructH2.repository.CustomerRepository;
import com.example.MapstructH2.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repo;
	private CustomerMapper mapper;
	
	public CustomerServiceImpl(CustomerRepository repo, CustomerMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}

	@Override
	public List<CustomerDto> getAll() {
		List<Customer> allCustomer = this.repo.findAll();
		
		return this.mapper.convertEntityListToDto(allCustomer);
	}
	
	
}
