package com.bjsxt.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Admin;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.pojo.Users;

public interface AdminService {
	//管理员登陆
	Admin selAdminPwd(Admin admin);
	
	// 显示所有用户总数
	int selUsersCounts();
	
	//显示所有图书数量
	int selRecordBooks();
	
	//管理员查看Bks_mes 所有信息
	List<BooksMes> selAllShow();
	
	// 管理员录入图书
	int insBooksMes(BooksMes booksMes);
	
	//修改图书信息
	int updBooks(BooksMes booksMes);
	
	//管理员删除图书
	int delBook(BooksMes booksMes);
	
	//管理员查询所有用户信息 
	List<Users> selAllUsers();
	
	//管理员为某用户还原密码初始密码 为 0000
	int updUserPwd(Users users);
	
	//管理员注销用户账号
	int delUser(Users users);
	
	
	//  管理员增加用户
    int insUsers(Users users);
	
    
	//  显示所有借书记录
	List<BrowRecord> showBrowRecord();
    
	// 显示管理员信息 
	List<Admin> showAdmin();
	
	//管理员修改自己密码
	int updAdminPwd(Admin admin);
}
