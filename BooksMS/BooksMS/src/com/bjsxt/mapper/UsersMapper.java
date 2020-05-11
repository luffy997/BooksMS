package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Users;

public interface UsersMapper {
	@Select("select * from users ")
	List<Users> selAll();
	
	
	//用户名查重
	@Select("SELECT user_id FROM users where username= #{username} ")
	Users selByUsername(Users users);
	//可用用户名和邮箱登陆
	@Select("select * from users where (username= #{username} or user_mail=#{username} )  and password=#{password}")
	Users selByUsersPwd(Users users);
	@Insert("insert into users values(default,#{username},#{password},#{user_tel},#{user_qq},#{user_mail},#{user_avatar})")
    int insUsers(Users users);
	@Update("update users set password= #{newPassword} where username= #{username}")
	int updUsers(Users users);
	
	//前端传回username 返回 user_avatar 头像参数
	@Select("SELECT user_avatar FROM users WHERE username= #{username} ")
	String selAvatar(Users users);
}
