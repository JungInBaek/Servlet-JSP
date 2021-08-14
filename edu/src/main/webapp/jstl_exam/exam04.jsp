<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="num" value="${95}" />
점수 <c:out value="${num}" />점은 

<c:if test="${num > 60}">
	합격입니다.
</c:if>

<br/>

점수 <c:out value="${num}" />점은 
<c:choose>
	<c:when test="${num >= 90}">A입니다.</c:when>
	<c:when test="${num >= 80}">B입니다.</c:when>
	<c:when test="${num >= 70}">C입니다.</c:when>
	<c:when test="${num >= 60}">D입니다.</c:when>
	<c:otherwise>F입니다.</c:otherwise>
</c:choose>