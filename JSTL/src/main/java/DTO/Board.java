package DTO;

public class Board {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private String upDtate;
	
	public Board() {
		
		this.title = "없음";
		this.writer = "없음";
		this.content = "없음";
	}

	public Board(String title, String writer, String content) {
		
		this.title = title;
		this.writer = writer;
		this.content = content;
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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getUpDtate() {
		return upDtate;
	}

	public void setUpDtate(String upDtate) {
		this.upDtate = upDtate;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", upDtate=" + upDtate + "]";
	}
	
		
	
}
