package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;


public interface BooksBrrowMapper {
	/*
	 * 图书详情页面
	 */
	@Select("SELECT * FROM bks_mes WHERE bk_name= #{bk_name}")
	List<BooksMes> showBookDetail(BrowRecord browRecord);
	
	/*
	 * 查询用户是否借了这本书未还  未还则不能还书  （查询是否有还书时间）
	 */
	@Select("SELECT brow_time FROM  brow_record where   username= #{username}  and bk_name= #{bk_name} and whether_ruturn=0")
	BrowRecord selByWhetherBorrow(BrowRecord browRecord);
	
	/*
	 * 根据bk_name  查询图书出版社
	 */
	@Select("SELECT bk_publish from bks_mes WHERE bk_name= #{bk_name}")
	String selPublishByBkName(BooksMes booksMes);
	
	/*
	 * 借书功能  插入借书记录
	 */
	@Insert("INSERT into brow_record(brow_id,username,bk_name,bk_publish,brow_time,whether_ruturn) VALUES(default,#{username},#{bk_name},#{bk_publish},#{brow_time},0)")
	int insBrowRecord(BrowRecord browRecord);
	
	/*
	 * 借书成功，修改  bks_mes 中 bk_times=bk_times+1   bk_else=bk_else-1
	 */
	@Update("update bks_mes SET bk_times=bk_times+1 , bk_else=bk_else-1 WHERE bk_name= #{bk_name}")
	int updTimes(BooksMes booksMes);

}
