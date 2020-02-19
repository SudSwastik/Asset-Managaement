package com.sudarshan.sud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sudarshan.sud.dao.EmployeeRepository;
import com.sudarshan.sud.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRep;

	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee aEmployee = new Employee(); 
		model.addAttribute("employee", aEmployee);
		return "new-employee";
	
	}
	
	@PostMapping("/save")
	public String createEmployee(Employee employee,Model model) {
		empRep.save(employee);
		return "redirect:/employees/new";
	
	}
}
