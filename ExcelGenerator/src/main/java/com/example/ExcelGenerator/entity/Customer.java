package com.example.ExcelGenerator.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    private String firstname;
    
    @Basic
    @Column(name = "lastname", nullable = true, length = 50)
    private String lastname;
    
	@Basic
    @Column(name = "email", nullable = false, length = 250)
    private String email;

}
