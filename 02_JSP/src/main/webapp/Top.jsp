<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

.topTable {
	width: 800px;
	border: 1px solid black; 
}


/* p {
	text-align: center;
} */
.logo {
	width: 200px;
	height: 70px;
}

.topTable tr {
	height: 100px;
}

.logoTd {
	width: 260px;
}

.topCellTr {
	height: 50px;
}

.topCellTr td {
	width: 130px;
}
</style>
</head>
<body>

	<!-- Top -->
	<table class="topTable">
		<tr>

			<!-- 로고 이미지 -->
			<td class="logoTd" colspan="2"><img class="logo" alt="logo"
				src="img/campingLogo.png" /></td>

			<td colspan="2">
				<h2>낭만 캠핑</h2>
			</td>
		</tr>
		<tr class="topCellTr">
			<td>캠핑</td>
			<td>의자</td>
			<td>식기</td>
			<td>침낭</td>
			<td>테이블</td>
			<td>화롯대</td>
		</tr>
	</table>

</body>
</html>