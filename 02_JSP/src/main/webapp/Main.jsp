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
	padding: 0;
	box-sizing: border-box;
}

body {
	display: flex;
	justify-content: center;
}

td {
	text-align: center;
}

.maintable {
	width: 800px;
	border: 1px solid black;
	border-collapse: collapse;
}
table{
border: 1px solid black;
}

.mainTopTr {
	height: 150px;
}

.mainLeftTr {
	height: 400px;
}

.mainLeftTd {
	width: 200px;
}

.mainCenterTd {
	width: 600px;
}

/* .centerTr {
	height: 400px;
}
 */
.mainBottomTr {
	height: auto;
}
</style>

</head>
<body>

	<section>

		<table class="maintable">
			<!-- Top -->
			<tr class="mainTopTr">
				<td colspan="2"><jsp:include page="Top.jsp" /></td>
			</tr>

			<!-- Left -->
			<tr class="mainLeftTr">
				<td class="mainLeftTd" style="width: 200px;"><jsp:include page="Left.jsp" /></td>
				<td class="mainCenterTd"><jsp:include page="Center.jsp" /></td> 
			</tr>

			<!-- Bottom -->
			<tr class="mainBottomTr">
				<td colspan="2"><jsp:include page="Bottom.jsp" /></td>
			</tr>
		</table>
	</section>
</body>
</html>