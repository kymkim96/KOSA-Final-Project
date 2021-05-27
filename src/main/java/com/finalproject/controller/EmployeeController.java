package com.finalproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finalproject.dto.EmployeeDto;
import com.finalproject.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeService;
	
	@ResponseBody
	@GetMapping("/employee")
	public EmployeeDto employee(int eid) {
		EmployeeDto employee = employeeService.getEmployee(eid);
		
		logger.info(employee.getHireDate().toString());
		
		return employee;
	}
}
