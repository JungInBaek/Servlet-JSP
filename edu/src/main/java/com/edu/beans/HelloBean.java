package com.edu.beans;

public class HelloBean {
	//	멤버변수, 필드, 속성
	private String name;
	private String number;
	
	//	생성자
	public HelloBean() {
		this.name = "이름이 없습니다.";
		this.number = "번호가 없습니다.";
	}
	
	//	메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
