package com.bjsxt.pojo;

public class Admin {
	private int id;
	private String admin_number;
	private String admin_pwd;
	private String admin_job;
	
	/*
	 * 接收新密码
	 */
	private String Newadmin_pwd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_number() {
		return admin_number;
	}
	public void setAdmin_number(String admin_number) {
		this.admin_number = admin_number;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public String getAdmin_job() {
		return admin_job;
	}
	public void setAdmin_job(String admin_job) {
		this.admin_job = admin_job;
	}
	public String getNewadmin_pwd() {
		return Newadmin_pwd;
	}
	public void setNewadmin_pwd(String newadmin_pwd) {
		Newadmin_pwd = newadmin_pwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin_number=" + admin_number + ", admin_pwd=" + admin_pwd + ", admin_job="
				+ admin_job + ", Newadmin_pwd=" + Newadmin_pwd + "]";
	}
	
}
