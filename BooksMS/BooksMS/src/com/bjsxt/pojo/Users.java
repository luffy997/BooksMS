package com.bjsxt.pojo;

public class Users {
	private int user_id;
	private String username;
	private String password;
	private int user_tel;
	private int user_qq;
	private String user_mail;
	private String user_avatar;
	/*
	 * 后台接收新密码参数
	 */
	private String newPassword;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(int user_tel) {
		this.user_tel = user_tel;
	}
	public int getUser_qq() {
		return user_qq;
	}
	public void setUser_qq(int user_qq) {
		this.user_qq = user_qq;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getUser_avatar() {
		return user_avatar;
	}
	public void setUser_avatar(String user_avatar) {
		this.user_avatar = user_avatar;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", user_tel="
				+ user_tel + ", user_qq=" + user_qq + ", user_mail=" + user_mail + ", user_avatar=" + user_avatar
				+ ", newPassword=" + newPassword + "]";
	}
	
	
	
}
