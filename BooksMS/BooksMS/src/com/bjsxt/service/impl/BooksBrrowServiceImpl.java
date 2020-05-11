package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.BooksBrrowMapper;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksBrrowService;
@Service
public class BooksBrrowServiceImpl implements BooksBrrowService {
	@Resource
	private BooksBrrowMapper booksBrrowMapper;

	@Override
	public List<BooksMes> showBookDetail(BrowRecord browRecord) {
		return booksBrrowMapper.showBookDetail(browRecord);
	}

	@Override
	public BrowRecord selByWhetherBorrow(BrowRecord browRecord) {return booksBrrowMapper.selByWhetherBorrow(browRecord);
	}

	@Override
	public String selPublishByBkName(BooksMes booksMes) {
		return booksBrrowMapper.selPublishByBkName(booksMes);
	}

	@Override
	public int insBrowRecord(BrowRecord browRecord) {
		return booksBrrowMapper.insBrowRecord(browRecord);
	}

	@Override
	public int updTimes(BooksMes booksMes) {
		return booksBrrowMapper.updTimes(booksMes);
	}

	
	
	
}
