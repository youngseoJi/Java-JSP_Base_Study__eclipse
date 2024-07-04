package board;

import java.util.Date;

// "NUM", "TITLE", "WRITER", "CONTENT", "REGDATE", "CNT"
//테이블의 ~명과 매칭시켜주는게 좋다 : 이유는 ~

//게시글 1개의 정보를 담을수 있는 클래스 정의 

public class BoardVo {
    private int num;
    private String title;
    private String writer;
    private String content;
    private Date regdate;
    private int cnt;
    
	//  default 기본 생성자
    public BoardVo() {}
    
	public BoardVo(int num, String title, String writer, String content, Date regdate, int cnt) {
		super();
		this.num = num; // 번호
		this.title = title; // 제목
		this.writer = writer; // 작성자
		this.content = content; //내용
		this.regdate = regdate; // 등록일
		this.cnt = cnt; // 조회수 
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

	//값 확인을 위한
	@Override
	public String toString() {
		return "BoardVo [num=" + num + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
    
    
}
