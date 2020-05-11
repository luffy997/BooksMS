package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;

public interface BooksRecomMapper {
	@Select("SELECT * FROM bks_mes ORDER BY bk_grade DESC")
	List<BooksMes> showGradeBooks();
	@Select("SELECT * FROM  bks_mes ORDER BY bk_times DESC")
	List<BooksMes> showTimesBooks();
	/**
	 * 联合查询，猜你喜欢(根据你之前借的书，查询这些书被哪些人借，再找到他们借的书) 返回图书信息
	 */
	@Select(" SELECT * from bks_mes where bk_name in(\r\n" + 
			" SELECT DISTINCT bk_name from brow_record where username in ( \r\n" + 
			"			SELECT username from brow_record where bk_name in( \r\n" + 
			"			SELECT bk_name from brow_record where username = #{username}\r\n" + 
			"			)  \r\n" + 
			"			)\r\n" + 
			"			)\r\n" + 
			" ")
	List<BooksMes> rencommend_booksShow(BrowRecord browRecord);
	
}
