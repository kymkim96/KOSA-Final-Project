package com.finalproject.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.dto.PageDto;

@Repository
public class PageDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<PageDto> selectByCategory(String category) {
		
		List<PageDto> pages = sqlSessionTemplate.selectList("pages.selectByCategory", category);
		return pages;
	}
}
