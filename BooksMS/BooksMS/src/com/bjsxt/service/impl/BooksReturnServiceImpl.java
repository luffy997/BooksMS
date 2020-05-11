package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.BooksReturnMapper;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksReturnService;
@Service
public class BooksReturnServiceImpl implements BooksReturnService{
	@Resource
	private BooksReturnMapper booksReturnMapper;

	@Override
	public List<BrowRecord> showAllBkRecord(BrowRecord browRecord) {
		return booksReturnMapper.showAllBkRecord(browRecord);
	}
	
	
	@Override
	public List<BrowRecord> showBrowBooks(BrowRecord browRecord) {
		return booksReturnMapper.retrunBooks(browRecord);
	}

	@Override
	public int updReturn(BrowRecord brRecord) {
		return booksReturnMapper.updReturnbooks(brRecord);
	}

	@Override
	public int updTimes(BrowRecord browRecord) {
		return booksReturnMapper.updBookTimes(browRecord);
	}

	

	
}
