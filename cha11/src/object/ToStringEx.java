package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		// Book 클래스 타입 인스턴스
		// String 메서드 재정의 한 결과
		Book book = new Book("책1", "영서작가");
		System.out.println(book); // 책1,영서작가
		/* String 메소드 재정의 하기 전 출력값
		Book book = new Book("책1", "영서작가");
		System.out.println(book); // object.Book@606d8acf*/
		
		// String 클래스 타입 인스턴스 
		// 문자가 그대로 출렬되는 이유? 이미 toString 되게 기본 설정되어 있기떄문
		String str = new String("test");
		System.out.println(str); // test
	}

}
