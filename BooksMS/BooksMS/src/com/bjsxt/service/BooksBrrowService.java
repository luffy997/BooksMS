package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;

public interface BooksBrrowService {
	
	/*
	 * 图书详情页面
	 */
	List<BooksMes> showBookDetail(BrowRecord browRecord);

	/*
	 * 查询用户是否借了这本书  未还则不能还书
	 */
	BrowRecord selByWhetherBorrow(BrowRecord browRecord);
	
	/*
	 * 根据bk_name  查询图书出版社
	 */
	String selPublishByBkName(BooksMes booksMes);

	/*
	 * 借书功能  插入借书记录
	 */
	int insBrowRecord(BrowRecord browRecord);

	/*
	 * 借书成功，修改  bks_mes 中 bk_times=bk_times+1   bk_else=bk_else-1
	 */
	int updTimes(BooksMes booksMes);
	
}
