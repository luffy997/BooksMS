package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bjsxt.pojo.Admin;
import com.bjsxt.pojo.BooksMes;
import com.bjsxt.pojo.BrowRecord;
import com.bjsxt.pojo.Users;

public interface AdminMapper {
	/*
	 * 管理员登陆验证
	 */
	@Select("SELECT * FROM admin WHERE admin_number= #{admin_number} and admin_pwd= #{admin_pwd}")
	Admin selAdminPwd(Admin admin);
	/*
	 * 显示所有用户总数
	 */
	@Select("SELECT count(user_id) FROM users")
	int selUsersCounts();
	
	/*
	 * 显示所有图书数量
	 */
	@Select("SELECT count(brow_id) FROM brow_record")
	int selRecordBooks();
	
	/*
	 * 管理员查看Bks_mes 所有信息
	 */
	@Select("SELECT * FROM bks_mes")
	List<BooksMes> selAllShow();
	
	/*
	 * 管理员录入图书
	 */
	@Insert("insert into bks_mes VALUES (default, #{bk_name} ,#{bk_writer} ,#{bk_publish} ,#{bk_intro},0,#{bk_amount},#{bk_else}, #{bk_grade});")
	int insBooksMes(BooksMes booksMes);
	
	
	/*
	 * 管理员删除图书
	 */
	@Delete("DELETE FROM bks_mes WHERE bk_number= #{bk_number}")
	int delBook(BooksMes booksMes);
	
	/*
	 * 管理员修改图书信息  根据前端传回的bk_id
	 */
	@Update("update bks_mes set bk_name=#{bk_name} ,bk_writer= #{bk_writer},bk_publish= #{bk_publish},bk_amount=#{bk_amount},bk_grade=#{bk_grade} where bk_number=#{bk_number}")
	int updBooks(BooksMes booksMes);
	
	/*
	 * 管理员查询所有用户信息 
	 */
	@Select("SELECT * FROM users")
	List<Users> selAllUsers();
	
	/*
	 * 管理员为某用户还原密码初始密码 为 0000
	 */
	@Update("update users set password='0000' where user_id = #{user_id}")
	int updUserPwd(Users users);
	
	/*
	 * 管理员注销用户账号
	 */
	@Delete("DELETE FROM users WHERE user_id= #{user_id}")
	int delUser(Users users);
	
	/*
	 * 管理员增加用户
	 */
	@Insert("insert into users values(default,#{username},#{password},#{user_tel},#{user_qq},#{user_mail},'/Books/img/icon.jpg')")
    int insUsers(Users users);
	
	/*
	 * 显示所有借书记录
	 */
	@Select("select * from brow_record")
	List<BrowRecord> showBrowRecord();
	
	/*
	 *显示管理员信息 
	 */
	@Select("SELECT * FROM admin ")
	List<Admin> showAdmin();
	
	/*
	 * 管理员修改自己密码
	 */
	@Update("update admin set admin_pwd=#{Newadmin_pwd} where admin_number=#{admin_number}")
	int updAdminPwd(Admin admin);
	
}
