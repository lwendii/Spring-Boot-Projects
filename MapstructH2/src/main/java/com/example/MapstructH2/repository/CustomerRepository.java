package com.example.MapstructH2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MapstructH2.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
