package DTO;

import java.util.Date;

public class Board {

	private int no; // 번호
	private String title; // 제목
	private String writer; // 작성자
	private String content; // 내용
	private Date regDate; // 등록일자
	private Date upDtate; // 수정일자

	// 기본 생성자 (매개변수가 없는 생성자) : 객체 초기화 
	public Board() {

		this.title = "무제";
		this.writer = "";
		this.content = "";
	}

	public Board(String title, String writer, String content) {

		this.title = title;
		this.writer = writer;
		this.content = content;
;	}

	public Board(int no, String title, String writer, String content) {

		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.upDtate = new Date();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpDtate() {
		return upDtate;
	}

	public void setUpDtate(Date upDtate) {
		this.upDtate = upDtate;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", upDtate=" + upDtate + "]";
	}

}
