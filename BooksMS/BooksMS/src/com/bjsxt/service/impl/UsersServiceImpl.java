package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;

	@Override
	public Users login(Users users) {
		return usersMapper.selByUsersPwd(users);
	}

	@Override
	public List<Users> show() {
		return usersMapper.selAll();
	}

	@Override
	public int insRegister(Users users) {
		return usersMapper.insUsers(users);
	}

	@Override
	public int updateUsers(Users users) {
		int i=usersMapper.updUsers(users);
		return i;
	}

	@Override
	public Users selByUsername(Users users) {
		return usersMapper.selByUsername(users);
	}

	@Override
	public String selAvatar(Users users) {
		return usersMapper.selAvatar(users);
	}
	
}
