package com.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finalproject.dto.EmployeeDto;

@Controller
public class HelloController {
	
	@ResponseBody
	@GetMapping("/")
	public String hello() {
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("id", "testId");
		EmployeeDto employee = new EmployeeDto();
		employee.setFirstName("hi");
		
		return "hello world";
	}
}
