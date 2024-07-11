<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include 디렉티브 </title>

<style>
* {
	margin: 0px;}
body {
	margin: 0px;
	width: 100%;
	display: flex;
	justify-content: center;
}

section {
	width: 100%;
	display: flex;
	justify-content: center; /* 가로 중앙 정렬 */
	
}

table {
	width: 100%;
	/* width: 600px; */
	border-collapse: collapse;
	border: 1px solid black;
}

.topTr {
	height: 150px;
}

td {
	width: 600px;
	text-align: center;
}

.centerTr {
	height: 400px;
}

.bottomTr {
	height: 100px;
}
</style>
</head>
<body>

	<section>
		<table>

			<!-- Top -->
			<tr class="topTr">
				<td class="topTd">
					<!-- include 지시어 : 다른 jsp를 불러온다. --> <%@ include file="Top.jsp"%>
				</td>
			</tr>
			<!-- center -->
			<tr class="centerTr">
				<td class="topTd"><img alt="" src="img/camera.png" width="400"
					height="300"></td>
			</tr>

			<!-- bottom -->
			<tr class="bottomTr">
				<td><%@ include file="Bottom.jsp"%></td>
			</tr>
		</table>
	</section>


</body>
</html>