package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.BooksRecomMapper;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksMesService;
import com.bjsxt.service.BooksRecomService;
@Service
public class BooksRecomServiceImpl implements BooksRecomService {
	@Resource
	private BooksRecomMapper booksRecomMapper;

	@Override
	public List<BooksMes> showGrade() {
		return booksRecomMapper.showGradeBooks();
	}

	@Override
	public List<BooksMes> showTimes() {
		return booksRecomMapper.showTimesBooks();
	}

	@Override
	public List<BooksMes> rencommend_booksShow(BrowRecord browRecord) {
		return booksRecomMapper.rencommend_booksShow(browRecord);
	}
	
	
	
}
