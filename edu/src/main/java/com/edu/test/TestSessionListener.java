package com.edu.test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener implements HttpSessionListener {
	//	생성자
	public TestSessionListener() {
		System.out.println("TestSessionListener 객체 생성");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("세션 객체 생성");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("세션 객체 해제");
	}
}
