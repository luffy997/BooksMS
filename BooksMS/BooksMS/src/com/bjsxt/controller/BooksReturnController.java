package com.bjsxt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksRecomService;
import com.bjsxt.service.BooksReturnService;

@Controller
public class BooksReturnController extends HttpServlet{
	@Resource
	private BooksReturnService booksReturnService;


	/*
	 * 显示所有借书记录
	 */
	@RequestMapping(value = "/api/allBrowRecord",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BrowRecord> showAllBrowRecord(@RequestBody BrowRecord browRecord,HttpServletRequest req){
		//测试数据
//		browRecord.setUsername("路飞");
		List<BrowRecord> list=booksReturnService.showAllBkRecord(browRecord);
		return list;
	}



	/*
	 * 显示借书记录
	 */
	@RequestMapping(value = "/api/browRecord",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BrowRecord> showBrowBooks(@RequestBody BrowRecord browRecord,HttpServletRequest req){
		//测试数据
//		browRecord.setUsername("褚四浩");
		List<BrowRecord> list=booksReturnService.showBrowBooks(browRecord);
		return list;
	}
	/*
	 * 还书功能 更新两张表的两个字段
	 */
	@RequestMapping(value = "/api/returnBooks",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String returnBooks(@RequestBody BrowRecord browRecord,BooksMes booksMes,HttpServletRequest req) {
		/*
		 * 测试数据 路飞还   三寸金莲（冯骥才《俗世奇人》 借书时间2020/03/08 21:05:14 
		 */
		
		//获取当前时间 格式 2020/03/08 20:49:06
				Date now = new Date(); 
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				String return_time = dateFormat.format(now); 
				System.out.println(return_time);
				
				String returnBooks=null;
				/*browRecord.setUsername("路飞");
				browRecord.setBrow_time("2020/03/09 18:30:32");

				browRecord.setBk_publish("西方出版社");
				browRecord.setBk_name("三寸金莲（冯骥才《俗世奇人》");
				booksMes.setBk_name("三寸金莲（冯骥才《俗世奇人》");*/
				browRecord.setReturn_time(return_time);
				int index= booksReturnService.updReturn(browRecord);
				int index2=booksReturnService.updTimes(browRecord);
				if (index>0&&index2>0) {
					returnBooks="{\"1\"}";
					return returnBooks;
				}else {
					returnBooks="{\"0\"}";  
					return returnBooks;
				}
				//返回   index:数字       json格式 判断数字是否大于0  即可判断出还书是否成功
	}
}

