package com.bjsxt.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.BooksMes;
import com.bjsxt.service.BooksMesService;

@Controller
public class BooksMesController extends HttpServlet {
	@Resource
	private BooksMesService booksMesService;
	
	@RequestMapping("/api/findbooks")
    @ResponseBody
    @CrossOrigin
    public List<BooksMes> booksSelect(@RequestBody BooksMes booksMes,HttpServletRequest req) {
		List<BooksMes> list;
		if (booksMes!=null) {
		     list = booksMesService.show(booksMes);
		  //   int counts=booksMesService.totalCounts(booksMes);
		} else {
			 list = booksMesService.showAll();
			 
		}
	     //返回用户信息，要使用@ResponseBody将返回值转换为JSON
		return list;
	}
}

	

