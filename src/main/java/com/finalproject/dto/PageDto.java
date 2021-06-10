package com.finalproject.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class PageDto {

	private int pid;
	private String title;
	private String param1;
	private String param2;
	private String prepro;
	
}
