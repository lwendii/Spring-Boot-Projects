package com.example.SpringH2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringH2.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
