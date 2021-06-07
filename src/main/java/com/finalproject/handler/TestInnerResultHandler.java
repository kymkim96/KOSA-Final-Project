package com.finalproject.handler;

import java.util.List;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

import com.finalproject.dto.PageDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TestInnerResultHandler implements ResultHandler<PageDto> {
	
	public List<PageDto> returnList = null;
	
	public TestInnerResultHandler(List<PageDto> returnList) {
		this.returnList = returnList;
	}
	
	@Override
	public void handleResult(ResultContext context) {
		Object object = context.getResultObject();
		returnList.add((PageDto) object);
	}

}
