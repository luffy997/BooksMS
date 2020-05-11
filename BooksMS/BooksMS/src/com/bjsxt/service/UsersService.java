package com.bjsxt.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Users;

public interface UsersService {
	/**
	 * 测试框架，查询全部
	 * @return
	 */
	List<Users> show();
	/*
	 *用户名查重 
	 */
	Users selByUsername(Users users);
	
	/**
	 * 登陆验证
	 * @param users
	 * @return
	 */
	Users login(Users users);
	/**
	 * 注册
	 */
	int insRegister(Users users);
	/**
	 * 修改密码
	 */
	int updateUsers(Users users);
	
	/*
	 * 返回 user_avatar 头像参数
	 */
	String selAvatar(Users users);
}
