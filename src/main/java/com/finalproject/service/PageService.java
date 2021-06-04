package com.finalproject.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.dao.PageDao;
import com.finalproject.dto.PageDto;

@Service
public class PageService {

	@Autowired
	private PageDao pageDao;
	
	public List<PageDto> getPages(String category) {
		
		List<PageDto> pages = pageDao.selectByCategory(category);
		return pages;
	}
}
