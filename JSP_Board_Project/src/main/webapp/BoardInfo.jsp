<%@page import="model.BoardBean"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	width: 600px;
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

.board-content {
	text-align: left;
	width: 200px;
}

.content {
	height: 300px;
	vertical-align: top;
	padding: 10px 20px; /* 패딩값 유지 */
}

.board-title {
	width: 100px;
}

button {
	padding: 2px 10px;
	margin-left: 10px;
}

</style>

</head>
<body>

	<%
	// request로부터 전달된 파라미터 num(string타입)을 정수형으로 변환하여 가져온다. 
		int num = Integer.parseInt(request.getParameter("num").trim());
		/* String num = request.getParameter("num"); */

		// 데이터베이스 접근을 위한 BoardDAO 객체 생성
		BoardDAO boardDAO = new BoardDAO();

		/* 게시글 갖고오기 
		num에 해당하는 특정 게시글의 정보를 데이터베이스에서 조회하고,
		이를 게시글 BoardBean 객체 타입으로 가져온다.*/
		BoardBean board = boardDAO.getOneBoard(num);
		
		System.out.println("Board Info:");
		System.out.println("Num: " + board.getNum());
		System.out.println("Ref: " + board.getRef());
		System.out.println("Re_step: " + board.getRe_step());
		System.out.println("Re_level: " + board.getRe_level());
	%>

	<section>
		<!-- 게시글 보여질 정보
			 1. 번호
			 2. 작성자
			 3. 제목 (1줄)
			 4. 작성날짜
			 5. 조회수
			 6. 글내용(1줄)
			 7. 이메
			 
	 -->
		<h2>게시글 보기</h2>
		<table>
			<tr>
				<td class="board-title">번호</td>
				<td class="board-content"><%=board.getNum()%></td>
				<td class="board-title">조회수</td>
				<td class="board-content"><%=board.getRead_count()%></td>
			</tr>
			<tr>
				<td class="board-title">작성자</td>
				<td class="board-content"><%=board.getWriter()%></td>
				<td class="board-title">작성일</td>
				<td class="board-content"><%=board.getReg_date()%></td>
			</tr>
			<tr>
				<td class="board-title">제목</td>
				<td colspan="4"><%=board.getTitle()%></td>
			</tr>
			<tr>
				<td class="board-title">내용</td>
				<td class="board-content content" colspan="4"><%=board.getContent()%></td>
			</tr>
			<tr>
				<td class="board-title">이메일</td>
				<td class="board-content" colspan="4"><%=board.getEmail()%></td>
			</tr>
			<!-- 버튼 
					1. 답글쓰기
					- 파라미터값
					- num pk값 게시글 번호= 읽고있는 글이 무엇인지 알 수있는 번호 ,
					- ref 글그룹:부모그룹과 동일한 글그룹이어야함, 부모글에 달린 답글이니
					- re_step, re_level : 답글 달면 +1 씩 증가해줘야한다. 답글의 답글 연달아서 달 수 있음
					2. 수정하기
					3. 삭제하기
					4. 전체목록
					
					
				
			-->
			 <tr>
			 
			 
				<td class="control-btns" colspan="4">
					<button
						onclick="location.href='BoardReWriteForm.jsp?num=<%=board.getNum()%>&ref=<%=board.getRef()%>&re_step=<%=board.getRe_step()%>&re_level=<%=board.getRe_level()%>'">답글</button>
						
						
					<button onclick="location.href='BoardUpdateForm.jsp?num=<%=board.getNum()%>'">수정</button>
					<button onclick="location.href='BoardDeleteForm.jsp?num=<%=board.getNum()%>'">삭제</button>
					<button onclick="location.href='BoardList.jsp'">목록</button>
				</td>
			</tr> 
		</table>
	</section>

</body>
</html>