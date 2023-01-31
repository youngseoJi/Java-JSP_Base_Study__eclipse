package array;

// 객체배열 얕은 복사  : 같은 인스턴스 객체를 가리키고 있어서 주소복사, 동일한 인스턴스의 메모리를 요소로 갖음
public class ObjesctCopy {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
	
		bookArr1[0] = new Book("책1", "작가1");
		bookArr1[1] = new Book("책2", "작가2");
		bookArr1[2] = new Book("책3", "작가3");

		// arraycopy : 배열 복사 메소드
//		System.arraycopy(src, srcPos, dest, destPos, length);
// 						무엇을, 어디서부터, 어디다가, 어디서부터, 총 몇개를, 복사할것인지 
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
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
