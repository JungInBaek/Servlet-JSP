package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
//		try {
//			String getquery = req.getQueryString();
//			out.print("Query : " + getquery + "<br/>");
//			out.print("Query 길이 : " + getquery.length());
//		} catch(Exception e) {
//			out.print("요청을 처리하는 동안 오류가 발생하였습니다. : " + e);
//		}
		String getquery = req.getQueryString();
		out.print("Query : " + getquery + "<br/>");
		out.print("Query 길이 : " + getquery.length());
		
		out.print("<br/>Done!");
		out.close();
	}
}
