package com.example.OpenApiDoc.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	
	public Person() {
		
	}
	
	public Person(Long id, String firstName, String lastName, String email, String phone, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	
}
