package com.finalproject.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.dto.EmployeeDto;

@Repository
public class EmployeeDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public EmployeeDto selectById(int eid) {
		
		return sqlSessionTemplate.selectOne("employees.selectById", eid);
	}
}
