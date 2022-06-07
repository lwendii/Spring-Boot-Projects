package com.example.OpenApiDoc.repository;

import java.util.List;

import com.example.OpenApiDoc.entity.Person;

public interface PersonRepository {
	List<Person> getAll();
	
	Person getById(Long id);
	
	Person save(Person newPerson);
	
	Person update(Person newPerson);
	
	void delete(Long id);
}
