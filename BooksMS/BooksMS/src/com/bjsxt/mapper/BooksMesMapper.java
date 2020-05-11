package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.BooksMes;



public interface BooksMesMapper {
	//查询全部
	@Select("select * from bks_name")
	List<BooksMes> selFirstAll();
	//根据书名进行模糊查询
	@Select("select * from bks_mes where  bk_name like '%' #{bk_name} '%' ")
	List<BooksMes> selAll(BooksMes booksMes);
	//查询检索到的数据量
	@Select("select count(*) from bks_mes where bk_name like '%' #{bk_name} '%' ")
	int selCount(BooksMes bookMes);
}
