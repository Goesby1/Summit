package com.example.webAppMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webAppMVC.model.Country;
import com.example.webAppMVC.repo.CountryRepo;

@Service
public class CountryService {
	
	@Autowired
	CountryRepo countryRepo;
	
	public List<Country> listCountries() {
		return countryRepo.findAll();
	}
	
	
	public String capital (String name) {
		return countryRepo.findCountryByName(name).getCapital();
	}
	
	public int population (String name) {
		return countryRepo.findCountryByName(name).getPopulation();
	}
	
	public Country get(String name) {
		
		return countryRepo.findCountryByName(name);
	}
	
	public void saveCountry(Country con) {
		
		countryRepo.save(con);
	}
	


}
