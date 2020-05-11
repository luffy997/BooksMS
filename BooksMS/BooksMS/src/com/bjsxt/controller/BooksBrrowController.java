package com.bjsxt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksBrrowService;
@Controller
public class BooksBrrowController extends HttpServlet{
	@Resource
	private BooksBrrowService booksBrrowService;
	
	/*
	 * 显示图书详情
	 */
	@RequestMapping("/api/detailBooks")
	@ResponseBody
	public List<BooksMes> ShowDetailBooks(@RequestBody BrowRecord browRecord,HttpServletRequest req) {
		//测试数据 前端传回  bk_name= '三寸金莲（冯骥才《俗世奇人》'
//		browRecord.setBk_name("三寸金莲（冯骥才《俗世奇人》");
		List<BooksMes> list=booksBrrowService.showBookDetail(browRecord);
		return list;
	}
	/*
	 * 判断是否借这本书 没有还
	 */
	@RequestMapping("/api/whetherReturn")
	@ResponseBody
	public String brrowBooks(@RequestBody BrowRecord browRecord,HttpServletRequest req) {
			// 前端传回bk_name  username  查询是否有归还时间  为空就没有还书  有值就已还书 可以借书
			//测试数据  路飞       达·芬奇密码
		String brrowBook=null;
//		browRecord.setUsername("路飞");
//		browRecord.setBk_name("达·芬奇密码");
		BrowRecord brRecords= booksBrrowService.selByWhetherBorrow(browRecord);
		if (brRecords==null) {
			brrowBook="{\"0\"}";      //  返回0 未借书
			return brrowBook;
		} else {
			brrowBook="{\"1\"}";      // 返回 1  已借书
			return brrowBook;
		}
	}

	/*
	 * 借书业务
	 */
	@RequestMapping("/api/brrowBooks")
	@ResponseBody
	public String brrowBookes(@RequestBody BrowRecord browRecord,HttpServletRequest req) {
		//测试数据      前端传回username    bk_name  bk_publish      胖虎      借  三寸金莲（冯骥才《俗世奇人》     时间date
		//获取当前实现 格式 2020/03/08 20:49:06

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String brow_time = dateFormat.format( now );

		String brrowBooks=null;
		System.out.println("browRecord========="+browRecord);
		//	System.out.println("booksMes==========="+booksMes);

		//browRecord.setUsername(username);
		//booksMes.setBk_name(bk_name);
//		System.err.println("booksMes================"+booksMes);
//		String publish=booksBrrowService.selPublishByBkName(booksMes);
//		System.out.println("publish=========="+publish);
		//	browRecord.setBk_publish(bk_publish);		//不能删

		browRecord.setBrow_time(brow_time);   //不能删
		//	browRecord.setBk_name(bk_name);
		int index= booksBrrowService.insBrowRecord(browRecord);
//		int index2=booksBrrowService.updTimes(booksMes);
		if (index>0) {
			brrowBooks="{\"1\"}";
			return brrowBooks;

		} else {
			brrowBooks="{\"0\"}";
			return brrowBooks;
		}
	}

	/*
	 * 增加借阅次数 减少库存
	 */
	@RequestMapping("/api/incTimes")
	@ResponseBody
	public  String incTimes(@RequestBody BooksMes booksMes,HttpServletRequest req) {
		String times=null;
		booksBrrowService.updTimes(booksMes);
		return times;

	}
}
