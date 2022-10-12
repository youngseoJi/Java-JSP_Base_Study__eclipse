package array;

public class Book {

	private String bookName;
	private String author;
	
	// 디폴트
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// getters, setter 함수생성
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 책 정보를 보여주는 메서드
	public void showBookInfomation() {
		System.out.println(bookName + ", " + author );
	}
	
	
}
