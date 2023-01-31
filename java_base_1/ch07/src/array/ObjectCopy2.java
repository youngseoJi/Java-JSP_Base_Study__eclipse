package array;
// 객체배열을 선언해도 인스턴스가 모두 생성되는 것 X
// 객체배열을 복사할때 같은 인스턴스를 가르키거나 다른 인스턴스를 가리킬 수 있음을 기억


//객체배열 깊은 복사 : 서로 다른 인스턴스의 메모리를 요소로 갖음
public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
	
		bookArr1[0] = new Book("책1", "작가1");
		bookArr1[1] = new Book("책2", "작가2");
		bookArr1[2] = new Book("책3", "작가3");
		// 디폴트 생성자로 인스턴스 생성
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();

		for(int i = 0; i < bookArr1.length; i++) {
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			bookArr2[i].setBookName(bookArr1[i].getBookName());
		}
	
		System.out.println("====첫번째 값변경한 bookArr1========");
		
		bookArr1[0].setBookName("책이름변경");
		bookArr1[0].setAuthor("다른작가이름");
		
	
		for(int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfomation();
		}
		/*책이름변경, 다른작가이름
		 *책2, 작가2
		 *책3, 작가3  */
		
		System.out.println("=====bookArr2=======");

		for(int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfomation();
		}
		 
		/*책1, 작가1
		 *책2, 작가2
		 *책3, 작가3  */
		// bookArr 1와 2의 객체배열의 값이 다르게 출력!
		
		System.out.println("=====처음부터 끝까지 배열요소 출력방법=======");

		String[] strArr = {"Java", "C", "C++"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] intArr = {1,2,3,4,5};
		
		for(int i : intArr) {
			System.out.println(i);
		}
	}


}
