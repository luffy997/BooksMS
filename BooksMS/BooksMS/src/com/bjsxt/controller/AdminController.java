package com.bjsxt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.bjsxt.pojo.BrowRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjsxt.pojo.Admin;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.AdminService;
@Controller
public class AdminController extends HttpServlet {
	@Resource
	private AdminService adminService;
	
	/*
	 * 管理员登陆 
	 */
	@RequestMapping(value = "/api/adminlogin",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String adminLogin(@RequestBody Admin admin, HttpServletRequest req)  {
		 //测试数据 
		String adminlogin=null;
		
		Admin admins=adminService.selAdminPwd(admin);
		if (admins!=null) {
			adminlogin="{\"1\"}";      //密码验证成功 返回1
			return adminlogin;
		} else {
			adminlogin="{\"0\"}";      //密码验证失败 返回0
			return adminlogin;
		}
	}
	/*
	 * 显示管理员信息
	 */
	@RequestMapping(value = "/api/owAdmin",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<Admin> showAdmin(Admin admin,HttpServletRequest req){
		//前端不传
		List<Admin> list=adminService.showAdmin();
		return list;
	}
	/*
	 * 显示图书总量 借阅总量 
	 */
	@RequestMapping(value = "/api/totalBksAndrecord",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	 public Map<String, Integer> totalUsersRecords(HttpServletRequest req)  { 
		Integer users=adminService.selUsersCounts();
		Integer record=adminService.selRecordBooks();
		System.out.println("users============="+users);
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("totalUsers", users);
		map.put("toalRecords", record);
		return map;	
	}
	
	/*
	 * 显示Bks_mes 所有信息
	 */
	@RequestMapping(value = "/api/showAllBooks",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BooksMes> showAllBooks (HttpServletRequest req){
		List<BooksMes> showAllBooks=adminService.selAllShow();
		return showAllBooks;
	}

	/*
	 * 管理员修改图书信息
	 */
	@RequestMapping(value = "/api/updBooks",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String updBooks(@RequestBody BooksMes booksMes ,HttpServletRequest req){
		//测试数据 前端传来 6个值    bk_number(主键 不能修改)   bk_name bk_writer bk_publish bk_amount bk_grade
		//把这本书的作者改成 路飞  总量改成200
		String updBooks=null;
		/*booksMes.setBk_number(104);
		booksMes.setBk_name("伊斯坦布尔假期（新版）");
		booksMes.setBk_writer("路飞");
		booksMes.setBk_publish("博集天卷出版社");
		booksMes.setBk_amount(200);
		booksMes.setBk_grade(9.3);*/
		int index=adminService.updBooks(booksMes);
		if (index>0) {
			updBooks ="{\"1\"}";
			return updBooks;   //修改成功 返回1
		}else {
			updBooks="{\"0\"}";
			return updBooks;   //修改失败 返回0
		}
	}

	/*
	 * 管理员删除图书
	 */
	@RequestMapping(value = "/api/delBooks",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String delBooks(@RequestBody BooksMes booksMes ,HttpServletRequest req){
		//测试数据 前端传来 删掉 bk_number 111
//		booksMes.setBk_number(111);
		String delBooks=null;
		int index=adminService.delBook(booksMes);
		if (index>0) {
			delBooks ="{\"1\"}";
			return delBooks;   //删除成功 返回1
		}else {
			delBooks="{\"0\"}"; 
			return delBooks;
		}
	}
	/*
	 * 管理员录入图书
	 */
	@RequestMapping(value = "/api/insBooks",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String insBooks(@RequestBody BooksMes booksMes ,HttpServletRequest req){
		//测试数据 插如 阿衰全集  猫小乐 浙江人民出版社  很好看的校园漫画 100本   评分9.4
		/*booksMes.setBk_writer("猫小乐");
		booksMes.setBk_name("阿衰全集");
		booksMes.setBk_publish("浙江人民出版社");
		booksMes.setBk_intro("很好看的校园漫画");
		booksMes.setBk_else(100);
		booksMes.setBk_amount(100);
		booksMes.setBk_grade(9.4);*/
		String insBooks=null;
		int index=adminService.insBooksMes(booksMes);
		if (index>0) {
			insBooks="{\"1\"}";
			return insBooks;
		} else {
			insBooks="{\"0\"}";
			return insBooks;
		}
	}
	/*
	 * 显示所有借书信息
	 */
	@RequestMapping(value = "/api/owBrowRecord",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<BrowRecord> showBrowRecord(HttpServletRequest req){
		//前端不传
		List<BrowRecord> list=adminService.showBrowRecord();
		return list;
	}

	/*
	 * 显示用户 所有信息
	 * 前端不传数据   后端直接返回json
	 */
	@RequestMapping(value = "/api/showAllUsers",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public List<Users> showAllUsers (HttpServletRequest req){
		List<Users> users=adminService.selAllUsers();
		return users;
	}

	/*
	 * 管理员增加用户
	 */
	@RequestMapping(value = "/api/insUsers",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String insUsers(@RequestBody Users users,HttpServletRequest req){
		//测试数据  阿冷  密码 123   电话 15623206870  qq 123 mail 32102@qq.com
		/*users.setUsername("阿冷");
		users.setPassword("123");
		users.setUser_tel(1562320);
		users.setUser_qq(123);
		users.setUser_mail("32102@qq.com");*/

		String insUsers=null;
		int index = adminService.insUsers(users);
		if(index>0){
			insUsers="{\"1\"}";
			return insUsers;   //注册成功 返回值>0
		}else{
			insUsers="{\"0\"}";
			return insUsers;   //注册失败 返回值<0
		}
	}
	/*
	 * 初始化用户密码  设成0000
	 */
	@RequestMapping(value = "/api/updUsersPwd",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String updUsersPwd(@RequestBody Users users,HttpServletRequest req){
		//前端传回   user_id   测试数据 user_id为1 
//		users.setUser_id(1);
		String updUsersPwd=null;
		int index=adminService.updUserPwd(users);
		if (index>0) {
			updUsersPwd="{\"1\"}";
			return updUsersPwd;
		} else {
			updUsersPwd="{\"0\"}";
			return updUsersPwd;
		}
	}
	/*
	 * 注销图书用户  
	 */
	@RequestMapping(value = "/api/delUsers",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String delUsers(@RequestBody Users users,HttpServletRequest req){
		//前端传回   user_id   测试数据 user_id为6
//		users.setUser_id(6);
		String delUsers=null;
		int index=adminService.delUser(users);
		if (index>0) {
			delUsers="{\"1\"}";
			return delUsers;
		} else {
			delUsers="{\"0\"}";
			return delUsers;
		}
	}
	/*
	 * 管理员修改自己的密码
	 */
	@RequestMapping(value = "/api/updAdminPwd",produces ={ "application/json;charset=UTF-8"})
	@ResponseBody
	public String updAdminPwd(@RequestBody Admin admin,HttpServletRequest req){
		//测试数据 把的密码改成  Alen2020 的密码改成  1215yxj.
		//首先验证 用户名  原密码 是否正确
		
		/*
		 * 前端传来三个参数 admin_number admin_pwd New
		 */
		
		String updAdminPwd=null;
		
		//切记对象别搞混
		Admin admins=adminService.selAdminPwd(admin);
		int index=adminService.updAdminPwd(admin);
		if (admins!=null&&index>0) {
				updAdminPwd="{\"1\"}"; 
				return updAdminPwd;   //更改成功 返回1
				
		}else {
				updAdminPwd="{\"0\"}";
				return updAdminPwd;   //更改失败 返回0
		}
	
	}
}
