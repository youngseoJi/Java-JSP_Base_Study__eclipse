package array;


	//객체배열 깊은 복사 : 서로 다른 인스턴스의 메모리를 요소로 갖음
public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
	
		bookArr1[0] = new Book("책1", "작가1");
		bookArr1[1] = new Book("책2", "작가2");
		bookArr1[2] = new Book("책3", "작가3");

		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		/* 복사 잘됨
		 * 책1, 작가1
		 * 책2, 작가2
		 * 책3, 작가3*/
		System.out.println("====첫번째 값변경한 bookArr1========");
		
		bookArr1[0].setBookName("책이름변경");
		bookArr1[0].setAuthor("다른작가이름");
		
	
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfomation();
		}
		
		System.out.println("=====bookArr2=======");

		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		
		// bookArr 1와 2의 값이 동일하게 출력, 값이 아닌 주소를 복사하기때문에 같은 객체가되어 한쪽 값이변경되면 같이 변경된다.
		/*책이름변경, 다른작가이름
		 *책2, 작가2
		 *책3, 작가3  */
	}

}
