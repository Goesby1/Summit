package com.summitwt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.summitwt.demo.service.EmployeeService;
import com.summitwt.demo.model.*;
import java.util.*;

@Controller
public class HomeController {
	
@Autowired
EmployeeService empService;

@RequestMapping("/list_employees")
public String listEmployees(Model model)
{
	List<Employee> list=empService.getEmployeeList();
	model.addAttribute("employees",list);
	return "employee";  // here its a view name, 
	
}
@RequestMapping("/")
public String welcome()
{
	return "index";
}
@RequestMapping("/delete/{id}")
public String deleteEmployee(@PathVariable(name="id") int id)
{
	empService.delete(id);
	return "redirect:/list_employees";
}

@RequestMapping("/edit/{id}")
public ModelAndView showEditEmployeePage(@PathVariable(name = "id") int id)
{
	ModelAndView mav = new ModelAndView("edit_employee");	
Employee emp = empService.get(id);

mav.addObject("employee",emp);
return mav;

}
@RequestMapping(value="/save", method=RequestMethod.POST  )
public String saveEmployee(@ModelAttribute("employee") Employee emp)
{
	empService.saveEmp(emp);
	return "redirect:/list_employees";
	
}

}
