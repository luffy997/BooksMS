package com.bjsxt.pojo;

public class BrowRecord {
	private int brow_id;
	private int user_id;
	private String username;
	private String brow_time;
	private String  return_time;
	private int whether_borrow;
	private String bk_name;
	private String bk_publish;
	public int getBrow_id() {
		return brow_id;
	}
	public void setBrow_id(int brow_id) {
		this.brow_id = brow_id;
	}
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
	public String getBrow_time() {
		return brow_time;
	}
	public void setBrow_time(String brow_time) {
		this.brow_time = brow_time;
	}
	public String getReturn_time() {
		return return_time;
	}
	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}
	public int getWhether_borrow() {
		return whether_borrow;
	}
	public void setWhether_borrow(int whether_borrow) {
		this.whether_borrow = whether_borrow;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getBk_publish() {
		return bk_publish;
	}
	public void setBk_publish(String bk_publish) {
		this.bk_publish = bk_publish;
	}
	@Override
	public String toString() {
		return "BrowRecord [brow_id=" + brow_id + ", user_id=" + user_id + ", username=" + username + ", brow_time="
				+ brow_time + ", return_time=" + return_time + ", whether_borrow=" + whether_borrow + ", bk_name="
				+ bk_name + ", bk_publish=" + bk_publish + "]";
	}
	
	
	
}
