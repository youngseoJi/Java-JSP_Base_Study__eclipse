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
	height: 100vh;
	text-align: center;
	display: flex;
	justify-content: center;
	margin: 20px;
}

section {
	display: flex;
	flex-direction: column;
	align-items: center;
}

a {
	text-decoration: none;
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

.write-btn {
	text-align: right;
	padding-right: 20px;
}

button {
	padding: 2px 10px;
	margin-left: 10px;
}

/* td.write-btn {
    text-align: right;
}
 */
</style>
</head>
<body>


	<%
	// 페이지에 표시할 게시글의 수 지정
	int pageSize = 10;
	// 현재 클릭한 페이지의 번호 값 (카운터) 저장 
	String pageNum = request.getParameter("pageNum");

	// 카운터 번호를 누르지않고 처음 게시글 목록을 클릭하거나 수정, 삭제 등 다른 게시글에서목록 페이지로 넘어오면 
	// pageNum 값이 없기에 null 처리 한다. -> 최신 글을 1page 보여준다.

	if (pageNum == null) {
		pageNum = "1";
	}
	// 전체 게시글 갯수 
	int boardCount = 0;
	// 페이지 번호 
	int pageNumber = 0;

	// 현재 페이지 숫자 저장 
	int currentPage = Integer.parseInt(pageNum);

	// 데이서 베이스 
	BoardDAO boardDAO = new BoardDAO();

	// 젠체 게시글의 갯수 가져오는 메소드 호출
	boardCount = boardDAO.getAllCount();

	// 현재 페이지에 보여줄 시작 번호 설정 = 데이터 베이스에서 갖고오는 시작번호
	int startRow = (currentPage - 1) * pageSize + 1;
	int endRow = currentPage * pageSize;

	// 최신글 10개를 기준으로 게시글 가져오는 메소드 호출

	// 게시글의 수가 미리 정해져 있지 않기 때문에 가변 길이 배열인 Vector 사용
	// BoardBean 객체들을 Vector에 담아 반환
	Vector<BoardBean> boardList = boardDAO.getAllBoard(startRow, endRow);
	/* Vector<BoardBean> boardList = boardDAO.getAllBoard(endRow, startRow); */

	// 테이블에 표시할 번호를 지정
	pageNumber = boardCount - (currentPage - 1) * pageSize;
	%>


	<section>
		<h2>전체 게시글 목록</h2>
		<table>

			<tr>
				<td class="write-btn" colspan="5">
					<button onclick="location.href='BoardWriteForm.jsp'">작성하기</button>
				</td>
			</tr>
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
				<td style="width: 80px;"><%=pageNumber--%></td>
				<td style="width: 200px; text-align: left;"><a
					href="BoardInfo.jsp?num=<%=board.getNum()%>"> <%
 // re_step이 1보다 크면 (답글이면)
 if (board.getRe_step() > 1) {
 	// 답글의 깊이 들여쓰기로 푯;
 	// step의 숫자가 클수록 답글에 답글이 많이 달린거라 -1 하며 들여쓰기 ㄴ이 많아진다. 
 	for (int j = 0; j < (board.getRe_step() - 1); j++) {
 %> <span>&nbsp;&nbsp;</span> <%
 }
 }
 %> <%=board.getTitle()%></a></td>
				<td><%=board.getWriter()%></td>
				<td style="width: 150px;"><%=board.getReg_date()%></td>
				<td><%=board.getRead_count()%></td>
			</tr>

			<%
			}
			%>
		</table>
		<p>
			<!-- 페이지 카운터링 -->
			<%
			if (boardCount > 0) {
				// 카운터링 숫자를 얼마나 보여줄 것인지 
				int pageCount = boardCount / pageSize + (boardCount % pageSize == 0 ? 0 : 1);

				// 시작페이지 숫자설정
				int startPage = 1;

				// 현재 페이지가 어느 그룹에 속하는지를 파악하여 그 그룹의 첫 페이지를 시작 페이지로 설정

				// 현재 페이지에 10(한 그룹에 표시할 페이지 수)으로 나누어 떨어지지 않으면
				if (currentPage % 10 != 0) {
					// 시작페에지를 현재페이지가 속하는 그룹의 첫번째 1번 페이지로 설정한다.  예)(13/10)*10 +1 = 21
					startPage = (int) (currentPage / 10) * 10 + 1;
				} else {
					startPage = ((int) (currentPage / 10 - 1)) * 10 + 1;
				}

				int pageBlock = 10; // 카운처링 처리숫
				int endPage = startPage + pageBlock - 1; //화면에 보여질 페이지의 마지막 숫자

				if (endPage > pageCount)
					endPage = pageCount;

				// 이전이라는 링크를 생성 
				if (startPage > 10) {
			%>
			<a href="BoarList.jsp?pageNum=<%=startPage - 10%>"> [이전]</a>
			<%
			}
			// 페이징 처리
			for (int i = startPage; i <= endPage; i++) {
			%>
			<a href="BoardList.jsp?pageNum-<%=i%>"> [<%=i%>]
			</a>
			<%
			}
			//다음이라는 링크 여부 파악

			if (endPage < pageCount) {
			%>
			<a href="BoardList.jsp?pageNum=<%=startPage + 10%>">[다]</a>
			<%
			}
			}
			%>
		</p>
	</section>
</body>
</html>
