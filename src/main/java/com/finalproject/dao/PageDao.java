package com.finalproject.dao;


import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalproject.dto.PageDto;
import com.finalproject.handler.TestInnerResultHandler;

@Repository
public class PageDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<PageDto> selectByCategory(String category) {
		
		List<PageDto> pages = new ArrayList<>();
		
		sqlSessionTemplate.select("pages.selectByCategory", category, new TestInnerResultHandler(pages));
		return pages;
	}
}
