package array;

// 객체 배열 만들기
public class BookArray {

	public static void main(String[] args) {
		
		// Book이 자료형 (해당 클래스)  
		// 책을 가리킬 주소의 자리가 5개 만들어진다.
		Book[] library = new Book[5]; 
		for(int i = 0 ; i < library.length; i++ ) {
			System.out.println(library[i]);// null 5번 출력
			// 객체 초기화 값은 null
		}
		// 인스턴스 생성하여 각 배열의 자리에 삽입
		library[0] = new Book("역사책1","ys");
		library[1] = new Book("역사책2","ys");
		library[2] = new Book("역사책3","ys");
		library[3] = new Book("역사책4","ys");
		library[4] = new Book("역사책5","ys");
		
		// 각 인스턴스/객체의 주소값  -> array.Book@33833882
		for(int i =0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// 배열 자리의 각 값이 출력 -> 역사책1, ys 
		for(int i =0; i < library.length; i++) {
			library[i].showBookInfomation();
		}
	}

}
