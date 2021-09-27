package com.example.webAppMVC.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.webAppMVC.model.Country;
import com.example.webAppMVC.service.CountryService;

@Controller
public class HomeController {
	
	@Autowired 
	CountryService countryService;
	
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Country> lst = countryService.listCountries();
		model.addAttribute("countries", lst);
		return "index";
	}
	
	@RequestMapping("/info/{name}")
	public String capAndPop(@PathVariable(name = "name") String name, Model model) {
		
		model.addAttribute("capital", countryService.capital(name));
		model.addAttribute("population", countryService.population(name));
		return "country";
	}
	
	@RequestMapping("/add")
	public ModelAndView addPopulation() {
		ModelAndView mav = new ModelAndView("add_population");
		Country con = new Country();
		mav.addObject("country", con);
		return mav;
	}
	
	@RequestMapping("/edit/{name}")
	public ModelAndView editPopulation(@PathVariable(name = "name") String name) {
		ModelAndView mav = new ModelAndView("edit_population");
		Country conGet = countryService.get(name);
		mav.addObject("country", conGet);
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savePopulation(@ModelAttribute("country") Country con) {
		countryService.saveCountry(con);
		return "redirect:/";
	}
}
