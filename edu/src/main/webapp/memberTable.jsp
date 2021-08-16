<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
    
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	Statement stmt = con.createStatement();
	String sql = "CREATE TABLE member(id VARCHAR2(10) PRIMARY KEY, pwd VARCHAR2(10), name VARCHAR2(10), mail VARCHAR2(20))";
	stmt.executeUpdate(sql);
	out.print("member 테이블이 생성되었습니다.");
	stmt.close();
	con.close();
%>