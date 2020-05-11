package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.BrowRecord;

public interface BooksReturnMapper {
	
	/*
	 * 显示全部借书记录 包括未还  已还
	 */
	@Select("SELECT * FROM brow_record where username= #{username}")
	List<BrowRecord> showAllBkRecord(BrowRecord browRecord);

	
	/*
	 * 查询该用户借未还的书籍  0是 未还书  1是已还书
	 */
	@Select("SELECT * FROM brow_record where username= #{username} and\r\n" + 
			"whether_ruturn= 0")
	List<BrowRecord> retrunBooks(BrowRecord browRecord);
	
	/**
	 * 还书成功   brow_record 插入return_time 修改 whether_ruturn= 0
	 */
	@Update("UPDATE brow_record set return_time= #{return_time},whether_ruturn='1' where username=#{username} and bk_name= #{bk_name} and brow_time= #{brow_time} ")
	int updReturnbooks(BrowRecord brRecord);
	
	/*
	 * 还书成功 bks_mes bk_else=bk_else+1
	 */
	@Update("UPDATE bks_mes set bk_else=bk_else+1 where bk_name= #{bk_name} ")
	int updBookTimes(BrowRecord browRecord);
	
}
