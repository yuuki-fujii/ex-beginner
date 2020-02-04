package com.example.form;

public class Exam03Form {
	private String price1;
	private String price2;
	private String price3;
	
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public String getPrice2() {
		return price2;
	}
	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public String getPrice3() {
		return price3;
	}
	public void setPrice3(String price3) {
		this.price3 = price3;
	}
	
	public Integer getIntPrice1() {
		return Integer.parseInt(price1);
	}
	
	public Integer getIntPrice2() {
		return Integer.parseInt(price2);
	}
	
	public Integer getIntPrice3() {
		return Integer.parseInt(price3);
	}
	
	@Override
	public String toString() {
		return "Exam03Form [price1=" + price1 + ", price2=" + price2 + ", price3=" + price3 + "]";
	}	
	
}
