package array;

public class Book {

	private String bookName;
	private String author;
	
	// ����Ʈ
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// getters, setter �Լ�����
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
	
	// å ������ �����ִ� �޼���
	public void showBookInfomation() {
		System.out.println(bookName + ", " + author );
	}
	
	
}