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

body {
	display: flex;
	jutify-content: center;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table {
	width: 800px;
}

td {
	text-align: center;
}

.topTr {
	height: 150px;
}

.leftTr {
	height: 400px;
}

.leftTr td {
	width: 200px;
}

.centerTd {
	width: 200px;
}

/* .centerTr {
	height: 400px;
}
 */
.leftTr td {
	width: 600px;
}

.bottomTr{
	height: 100px;
}



</style>

</head>
<body>

	<section>

		<table>
			<!-- Top -->
			<tr class="topTr">
				<td colspan="2"><jsp:include page="Top.jsp" /></td>
			</tr>

			<!-- Left -->
			<tr class="leftTr">
				<td class="leftTd"><jsp:include page="Left.jsp" /></td>
			<!-- </tr> -->

			<!-- Center -->
			<!-- <tr class="centerTr"> -->
				<td class="centerTd"><jsp:include page="Center.jsp" /></td>
			</tr>

			<!-- Bottom -->
			<tr class="bottomTr">
				<td colspan="2"><jsp:include page="Bottom.jsp" /></td>
			</tr>
		</table>
	</section>
</body>
</html>