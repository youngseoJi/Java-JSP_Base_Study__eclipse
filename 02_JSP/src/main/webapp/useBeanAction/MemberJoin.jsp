<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
body {
    margin: 0;
    width: 100%;
    text-align: center;
    display: flex;
    justify-content: center;
}
table {
    border-collapse: collapse;
    border: 1px solid black;
}
tr {
    height: 50px;
    border: 1px solid black;
}
td {
    border: 1px solid black;
}
.labelTd {
    width: 150px;
}
.inputTd {
    width: 300px;
}
.inputTd textarea {
    width: 95%;
    height: 100px;
    border: 1px solid #ccc;
    padding: 5px;
}
</style>
</head>
<body>

<!-- 입력한 데이터를 추후 조회, 출력할때 한번에 하기위해서는 -> 입력하는 여러개의 데이터를 한번에 저장시킬수 있는 클래스를 생성해야한다. -->
<section>
    <h2>회원가입</h2>
    <form action="MemvberJoinProc.jsp" method="post">
        <table style="width: 500px;">
            <tr>
                <td class="labelTd">아이디</td>
                <td class="inputTd">
                    <input type="text" name="id" placeholder="id를 입력해주세요">
                </td>
            </tr>
            <tr>
                <td class="labelTd">패스워드</td>
                <td class="inputTd">
                    <input type="password" name="password" placeholder="비밀번호는 영문과 숫자만 입력해주세요.">
                </td>
            </tr>
            <tr>
                <td class="labelTd">이메일</td>
                <td class="inputTd">
                    <input type="email" name="email">
                </td>
            </tr>
            <tr>
                <td class="labelTd">전화번호</td>
                <td class="inputTd">
                    <input type="tel" name="tel">
                </td>
            </tr>
            <tr>
                <td class="labelTd">주소</td>
                <td class="inputTd">
                    <input type="text" name="address">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">회원가입</button>
                    <button type="reset">취소</button>
                </td>
            </tr>
        </table>
    </form>
</section>

</body>
</html>
