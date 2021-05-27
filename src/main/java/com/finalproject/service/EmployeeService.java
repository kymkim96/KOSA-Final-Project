package com.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.EmployeeDao;
import com.finalproject.dto.EmployeeDto;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public EmployeeDto getEmployee(int eid) {
		EmployeeDto employee = employeeDao.selectById(eid);
		
		return employee;
	}
}
