package com.example.OpenApiDoc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OpenApiDoc.entity.Person;
import com.example.OpenApiDoc.repository.PersonRepository;

// http://localhost:8080/v3/api-docs/
// http://localhost:8080/swagger-ui/index.html
@RestController
@RequestMapping("/api/people")
public class PersonController {
	
	private PersonRepository repository;

	public PersonController(PersonRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping()
	public List<Person> getAll() {
		return this.repository.getAll();
	}
	
	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable Long id) {
		return this.repository.getById(id);
	}
	
	@PostMapping()
	public Person createNewPerson(@RequestBody Person newPerson) {
		return this.repository.save(newPerson);
	}
	
	@PutMapping("/{id}")
	public Person updatePerson(@RequestBody Person newPerson, @PathVariable Long id) {
		newPerson.setId(id);
		return this.repository.update(newPerson);
	}
	
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable Long id) {
		this.repository.delete(id);
	}
}
