package com.bjsxt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

@Controller
public class UsersController extends HttpServlet {
	@Resource
	private UsersService usersService;


	@RequestMapping(value = "/api/login", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String login(@RequestBody Users users, HttpServletRequest req) {
		//测试数据 路飞 123
//		users.setUsername("路飞");
//		users.setPassword("1235");
		String login = null;
		Users user = usersService.login(users);
		if (user != null) {
			login = "{\"1\"}";
			//密码验证成功 返回1
			return login;
		} else {
			login = "{\"0\"}";
			//密码验证失败 返回0
			return login;
		}
	}

	/*
	 * 用户注册时的用户名查重
	 */
	@RequestMapping(value = "/api/queryUsername",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String queryUsername(@RequestBody Users users,HttpServletRequest req){
		//测试数据 前端传回  username ='路飞'
		String queryUsername=null;
//		users.setUsername("路飞111");
		Users user=usersService.selByUsername(users);
		if (user==null) {
			queryUsername="{\"1\"}";       //用户名不存在 可注册
			return queryUsername;
		} else {
			queryUsername="{\"0\"}"; 	//用户名已存在
			return queryUsername;
		}
	}

	@RequestMapping(value = "/api/regist", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String register(@RequestBody Users users, HttpServletRequest req) {
		//测试数据  阿冷  密码 123   电话 15623206870  qq 123 mail 32102@qq.com
		/*users.setUsername("阿冷");
		users.setPassword("123");
		users.setUser_tel(1562320);
		users.setUser_qq(123);
		users.setUser_mail("32102@qq.com");
		users.setUser_avatar("..");*/

		String regist = null;
		int index = usersService.insRegister(users);
		if (index > 0) {
			regist = "{\"1\"}";
			return regist;   //注册成功 返回值>0
		} else {
			regist = "{\"0\"}";
			return regist;   //注册失败 返回值<0
		}
	}

	@RequestMapping(value = "/api/updatepwd", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String updatepwd(@RequestBody Users users, HttpServletRequest req) {
		//测试数据 把路飞的密码改成  212
		//首先验证 用户名  原密码 是否正确

		/*users.setUsername("路飞");  //测试数据
		users.setPassword("123456");
		users.setNewPassword("1234");
*/
		String updatepwd = null;
		System.out.println("打印新密码=======" + users.getNewPassword());
		Users user = usersService.login(users);
		System.out.println("user===========" + user);
		int index = usersService.updateUsers(users);
		System.err.println("index=======" + index);
		if (user != null && index > 0) {
			updatepwd = "{\"1\"}";
			return updatepwd;   //更改成功 返回1

		} else {
			updatepwd = "{\"0\"}";
			return updatepwd;   //更改失败 返回0
		}

	}
	/*
	 *用户头像显示
	 */
	@RequestMapping(value = "/api/owAvatar",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public Map<String, String> showAvatar(@RequestBody Users users, HttpServletRequest req){
		//前端传回username  阿冷1    返回user_avaert
//		users.setUsername("阿冷1");
		String showAvatar=usersService.selAvatar(users);
		Map<String, String> map=new HashMap<String, String>();
		map.put("user_avatar", showAvatar);
		return map;
	}
}

