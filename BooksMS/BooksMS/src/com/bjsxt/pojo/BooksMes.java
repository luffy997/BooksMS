package com.bjsxt.pojo;

public class BooksMes {
	private int bk_number;
	private String bk_name;
	private String bk_writer;
	private	String bk_publish;
	private String bk_intro;
	private int bk_times;
	private int bk_amount;
	private int bk_else;
	private double bk_grade;
	
	 // 查询记录数量
	private int counts;
	
	public int getBk_number() {
		return bk_number;
	}
	public void setBk_number(int bk_number) {
		this.bk_number = bk_number;
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
	public int getBk_amount() {
		return bk_amount;
	}
	public void setBk_amount(int bk_amount) {
		this.bk_amount = bk_amount;
	}

	
	public int getBk_else() {
		return bk_else;
	}
	public void setBk_else(int bk_else) {
		this.bk_else = bk_else;
	}
	public double getBk_grade() {
		return bk_grade;
	}
	public void setBk_grade(double bk_grade) {
		this.bk_grade = bk_grade;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public int getBk_times() {
		return bk_times;
	}
	public void setBk_times(int bk_times) {
		this.bk_times = bk_times;
	}
	public String getBk_writer() {
		return bk_writer;
	}
	public void setBk_writer(String bk_writer) {
		this.bk_writer = bk_writer;
	}
	public String getBk_intro() {
		return bk_intro;
	}
	public void setBk_intro(String bk_intro) {
		this.bk_intro = bk_intro;
	}
	@Override
	public String toString() {
		return "BooksMes [bk_number=" + bk_number + ", bk_name=" + bk_name + ", bk_writer=" + bk_writer
				+ ", bk_publish=" + bk_publish + ", bk_intro=" + bk_intro + ", bk_times=" + bk_times + ", bk_amount="
				+ bk_amount + ", bk_else=" + bk_else + ", bk_grade=" + bk_grade + ", counts=" + counts + "]";
	}
		
}
