<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
          rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <title>Insert title here</title>
</head>
<body>
<div>
	<h3>MyShop 목록</h3>
	<h3>총 ${totalCount }개의 상품이 존재합니다.</h3>
	<table class="table table-bordered" style="width:800px">
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
			<th>색상</th>
			<th>가격</th>
			<th>이미지주소</th>
		</tr>		
		<c:if test="${totalCount==0}">
			<tr>
				<td>
					<b>등록된 상품이 없습니다</b>
				</td>
			</tr>
		</c:if>
		<c:if test="${totalCount>0 }">
			<c:forEach var="dto" items="${list }" varStatus="i" >
			<tr>
				<td>${dto.num }</td>
				<td>${dto.sangpum }</td>
				<td>${dto.color }</td>
				<td>${dto.price }</td>
				<td>${dto.imagename }</td>	
			</tr>
			</c:forEach>
		</c:if>
	</table>
	
</div>
</body>
</html>
