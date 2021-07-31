package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("Request Method : " + request.getMethod() + "<br/>");
		out.print("Path Info : " + request.getPathInfo() + "<br/>");
		out.print("Path Translated : " + request.getPathTranslated() + "<br/>");
		out.print("Query String : " + request.getQueryString() + "<br/>");
		out.print("Content Length : " + request.getContentLength() + "<br/>");
		out.print("Content Type : " + request.getContentType() + "<br/>");
		out.print("</body></html>");
		out.close();
	}
}
