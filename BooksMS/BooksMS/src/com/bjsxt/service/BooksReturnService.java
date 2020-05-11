package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BrowRecord;

public interface BooksReturnService {
	/*
	 * 显示用户所有借书记录
	 */
	List<BrowRecord> showAllBkRecord(BrowRecord browRecord);

	
	/**
	 * 显示用户借书记录未还书
	 */
	List<BrowRecord> showBrowBooks(BrowRecord browRecord);

	/*
	 * 还书成功  更新 brow_record 
	 */
	int updReturn(BrowRecord brRecord);
	/*
	 * 还书成功  更新bks_mes
	 */
	int updTimes(BrowRecord browRecord);
}
