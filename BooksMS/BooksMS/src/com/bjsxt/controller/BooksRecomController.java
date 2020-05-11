package com.bjsxt.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.service.BooksRecomService;
@Controller
public class BooksRecomController extends HttpServlet {
	@Resource
	private BooksRecomService booksRecomService;
	
	/**
	 * 按评分
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/api/grade",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BooksMes> grade(HttpServletRequest req){
		List<BooksMes> gradeList=booksRecomService.showGrade();
		return gradeList;
	}
	
	/**
	 * 按借阅次数
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/api/times",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BooksMes> times(HttpServletRequest req){
		List<BooksMes> timesList=booksRecomService.showGrade();
		return timesList;
	}
	
	/**
	 * 按相似（猜你喜欢）
	 * @param browRecord
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/api/recommend",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BooksMes> recommend( BrowRecord browRecord,HttpServletRequest req){
		// 为用户路飞的推荐书
		browRecord.setUsername("路飞");
		List<BooksMes> recommendList=booksRecomService.rencommend_booksShow(browRecord);
		return recommendList;
	}
	
}
