<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
* {
	margin: 0;
}

table {
	width: 800px;
	/* 	border: 1px solid black; */
}

td {
	text-align: center;
}

/* p {
	text-align: center;
} */
.logo {
	width: 200px;
	height: 70px;
}

.titleTr {
	height: 100px;
}

.logoTd {
	width: 260px;
}

.cellTr {
	height: 50px;
}

.cellTr td {
	width: 130px;
}
</style>
</head>
<body>

	<!-- Top -->
	<table>
		<tr class="titleTr">

			<!-- 로고 이미지 -->
			<td class="logoTd" colspan="2"><img class="logo" alt="logo"
				src="img/campingLogo.png" /></td>

			<td colspan="2">
				<h2>낭만 캠핑</h2>
			</td>
		</tr>
		<tr class="cellTr">
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