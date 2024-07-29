package model;

// 게시판 Java Bean. 
// 데이터베이스의 'board' 테이블 매핑
public class BoardBean {

	private int num;         // 글 번호, 고유 식별자
	private String writer;   // 글쓴이
	private String email;    // 이메일
	private String title;    // 글제목
	private String password; // 글 비밀번호, 게시글 수정/삭제 비밀번호
	private String reg_date; // 글 작성날짜
	private int ref;         // 글 그룹, 게시글의 그룹을 나타내는 번호(답글 등의 계층적 구조에 사용)
	private int re_step;     // 글 스텝, 같은 그룹 내에서의 게시글 순서
	private int re_level;    // 글 레벨, 게시글의 계층 레벨(답글의 깊이)
	private int read_count;  // 조회수
	private String content;  // 글 내용

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

	public int getRe_level() {
		return re_level;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public int getRead_count() {
		return read_count;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
