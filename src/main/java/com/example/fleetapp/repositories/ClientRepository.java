package com.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fleetapp.models.Client;


	@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	
	
}
