package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		// 큐 타입 책장 셍성
		Queue shelfQueue = new BookShelf();
		// 순서대로 책 넣기
		shelfQueue.enQueue("이순신1");
		shelfQueue.enQueue("이순신2");
		shelfQueue.enQueue("이순신3");
		
		// 맨앞의 책부터 꺼내기
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
