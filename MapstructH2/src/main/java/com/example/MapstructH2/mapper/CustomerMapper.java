package com.example.MapstructH2.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.MapstructH2.dto.CustomerDto;
import com.example.MapstructH2.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	CustomerDto convertEntityToDto(Customer entity);
	
	Customer convertDtoToEntity(CustomerDto dto);

	List<CustomerDto> convertEntityListToDto(List<Customer> entityList);
	
}
