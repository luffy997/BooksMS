package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;

public interface BooksRecomService {

	/**
	 * 按评分推荐
	 */
	List<BooksMes> showGrade();
	/**
	 * 按借阅次数推荐
	 */
	List<BooksMes> showTimes();
	/**
	 * 按共同借书推荐
	 */
	List<BooksMes> rencommend_booksShow(BrowRecord browRecord);
	
}
