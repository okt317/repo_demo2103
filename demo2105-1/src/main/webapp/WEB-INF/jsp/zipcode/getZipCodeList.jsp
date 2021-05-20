<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Map" %>
<%@ page import="com.vo.ZipCodeVO" %>
<% 
	List<Map<String,Object>> zipList = 
	(List<Map<String,Object>>)request.getAttribute("zipList");
	int size = 0;
	if(zipList != null){
		size = zipList.size();
		
	}
	out.print("백엔드에서 넘어온 값의 크기"+size);
	out.print(zipList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getZipCodeList.jsp[Web-INF]</title>
</head>
<body>
우편번호검색기 페이지입니다
<%
/* 백엔드에서 넘어온 정보 */

%>
</body>
</html>