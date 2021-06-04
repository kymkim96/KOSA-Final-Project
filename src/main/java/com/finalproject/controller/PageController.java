package com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finalproject.dto.PageDto;
import com.finalproject.service.PageService;

@CrossOrigin(origins = "*")
@Controller
public class PageController {

	@Autowired
	private PageService pageService;
	
	@GetMapping("/pages")
	@ResponseBody
	public List<PageDto> pages(String category) {
		
		List<PageDto> pages = pageService.getPages(category);
		return pages;
	}
}
