package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.AdminMapper;
import com.bjsxt.pojo.Admin;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Resource
	private  AdminMapper adminMapper;

	@Override
	public Admin selAdminPwd(Admin admin) {
		return adminMapper.selAdminPwd(admin);
	}

	@Override
	public int selUsersCounts() {
		return adminMapper.selUsersCounts();
	}

	@Override
	public int selRecordBooks() {
		return adminMapper.selRecordBooks();
	}

	@Override
	public List<BooksMes> selAllShow() {
		return adminMapper.selAllShow();
	}

	@Override
	public int insBooksMes(BooksMes booksMes) {
		return adminMapper.insBooksMes(booksMes);
	}

	@Override
	public int delBook(BooksMes booksMes) {
		return adminMapper.delBook(booksMes);
	}

	@Override
	public List<Users> selAllUsers() {
		return adminMapper.selAllUsers();
	}

	@Override
	public int updUserPwd(Users users) {
		return adminMapper.updUserPwd(users);
	}

	@Override
	public int delUser(Users users) {
		return adminMapper.delUser(users);
	}

	@Override
	public int updAdminPwd(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.updAdminPwd(admin);
	}

	@Override
	public int updBooks(BooksMes booksMes) {
		return adminMapper.updBooks(booksMes);
	}

	@Override
	public int insUsers(Users users) {
		// TODO Auto-generated method stub
		return adminMapper.insUsers(users);
	}

	@Override
	public List<Admin> showAdmin() {
		// TODO Auto-generated method stub
		return adminMapper.showAdmin();
	}

	@Override
	public List<BrowRecord> showBrowRecord() {
		// TODO Auto-generated method stub
		return adminMapper.showBrowRecord();
	}
	
	
}
