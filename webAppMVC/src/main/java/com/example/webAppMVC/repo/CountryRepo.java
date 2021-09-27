package com.example.webAppMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.webAppMVC.model.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

	
	@Query("SELECT b FROM Country b WHERE b.name=?1")
	Country findCountryByName(String name);
		
	
}
