package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.BooksMesMapper;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.service.BooksMesService;
@Service
public class BooksMesServiceImpl implements BooksMesService {
	
	@Resource
	private  BooksMesMapper booksMesMapper;


	@Override
	public int totalCounts(BooksMes bookMes) {
		return booksMesMapper.selCount(bookMes);
	}


	@Override
	public List<BooksMes> show(BooksMes booksMes) {
		return booksMesMapper.selAll(booksMes);
	}


	@Override
	public List<BooksMes> showAll() {
		return booksMesMapper.selFirstAll();
	}




}
