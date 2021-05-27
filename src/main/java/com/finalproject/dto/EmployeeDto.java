package com.finalproject.dto;


import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class EmployeeDto {

	private String firstName;
	@DateTimeFormat(pattern="yy/MM/dd")
	private Date hireDate;
	private int salary;

}
