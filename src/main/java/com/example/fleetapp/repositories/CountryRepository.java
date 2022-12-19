package com.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fleetapp.models.Employee;

@Repository
public interface CountryRepository extends JpaRepository<Employee, Integer> {

	
	
}
