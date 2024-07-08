
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="board.*"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Bean 객체 사용
		 jsp_:useBean : BoardVo와 BoardDao 클래스의 인스턴스를 생성하고, 
		 이 인스턴스들을 각각 vo_와 dao_라는 이름으로 사용할 수 있다. 
 -->
<jsp:useBean id="vo" class="board.BoardVo" />
<jsp:useBean id="dao" class="board.BoardDao" />

<!-- jsp_:setProperty: 요청 파라미터를 JavaBean의 프로퍼티에 자동으로 할당한다.
		'property="*"' 옵션은  요청 파라미터의 이름과 JavaBean 내의 프로퍼티 이름이 일치할 때
     자동으로 해당 JavaBean의 setter 메소드를 호출하여 값을 설정합니다.
     
     예: 요청 파라미터 'title=게시글1'과 JavaBean의 'setTitle' 메소드를 통해 'title' 프로퍼티에 값 설정. -->
<jsp:setProperty name="vo" property="*" />


<%
/* 게시글 데이터를 데이터베이스에 저장 */
dao.insert(vo);

/* 
	c:redirect ~ 와 동일한 코드
	response.sendRedirect(request.getContextPath() + "board/list.jsp") */
%>


<!-- 게시글등록이 완료되면 게시글 목록으로 리다이렉트한다. -->
<c:redirect url="/board/list.jsp">
</c:redirect>
