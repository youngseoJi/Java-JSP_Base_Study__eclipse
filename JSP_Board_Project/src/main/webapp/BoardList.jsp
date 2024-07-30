<%@page import="model.BoardBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	width: 100%;
	text-align: center;
	display: flex;
	justify-content: center;
	margin: 20px;
}

h2 {
	margin: 10px;
}

table {
	width: 100%;
	border-collapse: collapse;
	border: 1px solid gray;
}

tr {
	height: 40px;
	border: 1px solid gray;
}

td {
	width: 100px;
	border: 1px solid gray;
	padding: 5px 20px;
}
</style>
</head>
<body>


	<%
	//	전체게시글의 내용을 jsp쪽으로 갖고온다.

	BoardDAO boardDAO = new BoardDAO();

	// 모든 게시글 정보를 가져오는 메소드 호출
	
	// 게시글의 수가 미리 정해져 있지 않기 때문에 가변 길이 배열인 Vector 사용
  // BoardBean 객체들을 Vector에 담아 반환
	Vector<BoardBean> boardList = boardDAO.getAllBoard();
	%>


	<section>
		<h2>전체 게시글 목록</h2>
		<table>
			<tr>
				<td style="width: 80px;">번호</td>
				<td style="width: 200px;">제목</td>
				<td>작성자</td>
				<td style="width: 150px;">작성일</td>
				<td>조회수</td>
			</tr>

			<%
			
			// Vector에 저장된 BoardBean 객체들을 순차적으로 꺼내서 출력
			for (int i = 0; i < boardList.size(); i++) {
				BoardBean board = boardList.get(i);// 현재 게시글의 정보가 담긴 BoardBean 객체 추출
				
			%>

			<tr>
				<td style="width: 80px;"><%=i + 1%></td>
				<td style="width: 200px;">
					<a href="BoardInfo.jsp?num=<%=board.getNum()%>"></a> 
					<%=board.getTitle()%></td>
				<td><%=board.getWriter()%></td>
				<td style="width: 150px;"><%=board.getReg_date()%></td>
				<td><%=board.getRead_count()%></td>
			</tr>

			<%
			}
			%>
		</table>
	</section>
</body>
</html>
