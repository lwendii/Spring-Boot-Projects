package com.example.OpenApiDoc.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.OpenApiDoc.entity.Person;
import com.example.OpenApiDoc.repository.PersonRepository;

@Service
public class PersonRepositoryImpl implements PersonRepository {
	
	private static List<Person> people = new ArrayList<>();
	
	public PersonRepositoryImpl() {
		// initialize test data
		people.add(new Person(1L, "John", "Doe", "johndoe@testml.com", "1234567", "address 1, street 11, city 13"));
		people.add(new Person(2L, "Jane", "Doe", "jane.doe@123mailb.de", "7654321", "address 2, street 22, city 13"));
		people.add(new Person(3L, "Jill", "Lane", "jlane@mailbox1.jp", "5553214", "address 3, street 33, city 12"));
		people.add(new Person(4L, "Patrick", "Star", "star@water.sea", "8823451", "stone 1, lane 2, bikini bottom"));
		people.add(new Person(5L, "Lori", "Das", "ldas@mai111.com", "333333", "address 5, street 5, city 1"));
	}

	@Override
	public List<Person> getAll() {
		return this.people;
	}

	@Override
	public Person getById(Long id) {
		return this.people.stream().filter(person -> person.getId().equals(id)).findAny().orElse(null);
	}

	@Override
	public Person save(Person newPerson) {
		this.people.add(newPerson);
		return newPerson;
	}

	@Override
	public Person update(Person newPerson) {
		Person currentPerson = people.stream()
				.filter(person -> person.getId().equals(person.getId()))
				.findAny()
				.orElse(null);
		currentPerson.setFirstName(newPerson.getFirstName());
		currentPerson.setLastName(newPerson.getLastName());
		currentPerson.setEmail(newPerson.getEmail());
		currentPerson.setPhone(newPerson.getPhone());
		currentPerson.setAddress(newPerson.getAddress());
		return currentPerson;
	}

	@Override
	public void delete(Long id) {
		Person removePerson = this.people.stream()
				.filter(person -> person.getId().equals(id))
				.findAny()
				.orElse(null);
		this.people.remove(removePerson);
	}

}
