package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BooksMes;

public interface BooksMesService {
	/**
	 * 显示所有书
	 */
	List<BooksMes> showAll();
	/**
	 * 模糊查询结果显示
	 */
	List<BooksMes> show(BooksMes booksMes);
	/**
	 * 模糊查询查询结果数目
	 */
	int totalCounts(BooksMes bookMes);
}
